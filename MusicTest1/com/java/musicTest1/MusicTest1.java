package com.java.musicTest1;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequencer;

/**
 * Created by Taly on 20.03.2017.
 */
public class MusicTest1 {
    public void play() {
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            System.out.println("Мы получили синтезатор");
        } catch (MidiUnavailableException ex) {
            System.out.println("Неудача");
        }
    }//закрываем play

    public static void main(String[] args) {
        MusicTest1 mt = new MusicTest1();
        mt.play();
    } //закрываем main
} //закрываем класс
