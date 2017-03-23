package com.taly.SimpleGui1;
import javax.swing.*;
/**
 * Created by Taly on 23.03.2017.
 */
public class SimpleGui1 {
	public static void main(String[] args) {
		//создаем фрейм
		JFrame frame = new JFrame();
		//создаем кнопку  и передаем конструктору кнопки текст, который будет на ней отображаться
		JButton button = new JButton("click me");
		//добавляем код, завершающий программу при закрытии окна
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//добавляем кнопку на панель фрейма
		frame.getContentPane().add(button);
		//присваиваем фрейму размер (в пикселях)
		frame.setSize(300, 300);
		//сделать фрейм видимым
		frame.setVisible(true);
	}
}
