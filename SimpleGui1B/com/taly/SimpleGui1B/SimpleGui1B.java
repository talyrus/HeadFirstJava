package com.taly.SimpleGui1B;
import javax.swing.*;
import java.awt.event.*; //в этом пакете хранятся ActionListener и ActionEvent
/**
 * Created by Taly on 23.03.2017.
 */
public class SimpleGui1B implements ActionListener {
// Реализуем интерфейс ActionListener
// Кнопка будет передавать события только тем, кто реализует интерфейс ActionListener
	JButton button;

	public static void main(String[] args) {
		SimpleGui1B gui = new SimpleGui1B();
		gui.go();
	}

	public void go() {
		JFrame frame = new JFrame();
		button = new JButton("click me");
		//Регистрируем нашу заинтересованность в кнопке. Добавить к списку слушателей.
		//Передаваемый аргумент должен быть объектом класса, реализуемого ActionListener
		button.addActionListener(this);

		frame.getContentPane().add(button);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}
    //Реализуем метод actionPerformed() интерфейса ActionListener.
	// Это фактически метод обработки событий
	// Кнопка вызывает этот метод, чтобы известить о наступлении события.
	// Она отправляет объект ActionEvent как аргумент, но он нам не нужен.
	//Достаточно знать, что событие произошло.

	@Override
	public void actionPerformed(ActionEvent event) {
		button.setText("I've been clicked!");
	}
}
