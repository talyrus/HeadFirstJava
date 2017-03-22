package com.taly.miniMiniMusicApp;
import javax.sound.midi.*;
/**
 * Created by Taly on 21.03.2017.
 */
public class MiniMiniMusicApp {
    public static void main(String[] args) {
        MiniMiniMusicApp mini = new MiniMiniMusicApp();
        mini.play();
    } //закрываем main

    public void play() {
        try {
            Sequencer player = MidiSystem.getSequencer(); //получаем синтезатор
            player.open();  //открываем его

            Sequence seq = new Sequence(Sequence.PPQ, 4); // используем конструктор синтезатора
            Track track = seq.createTrack(); //запрашиваем трек у последовательности
                        // трек содержит последовательности, а MIDI - данные в треке

            ShortMessage a = new ShortMessage(); // помещаем в трек MIDI-события
            a.setMessage(144, 1, 44, 100);
            MidiEvent noteOn = new MidiEvent(a, 1);
            track.add(noteOn);

            ShortMessage b = new ShortMessage();
            b.setMessage(128, 1, 44, 100);
            MidiEvent noteOff = new MidiEvent(b, 16);
            track.add(noteOff);

            player.setSequence(seq); //передаем последовательность синтезатору
            player.start(); //запускаем синтезатор
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    } //закрываем play()
} //закрываем класс
