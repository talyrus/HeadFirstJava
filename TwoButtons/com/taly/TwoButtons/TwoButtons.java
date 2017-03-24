package com.taly.TwoButtons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Taly on 24.03.2017.
 */
public class TwoButtons {
	JFrame frame;
	JLabel label;

	public static void main(String[] args) {
		TwoButtons gui = new TwoButtons();
		gui.go();
	}
	public void go() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton labelButton = new JButton("Change label");
		// передаем методу регистрации слушателя кнопки не this,
		// а экземпляр соотвествующего класса слушателя
		labelButton.addActionListener(new LabelListener());

		JButton colorButton = new JButton("Change color");
		colorButton.addActionListener(new ColorListener());

		label = new JLabel("I'm a label");
		MyDrawPanel drawPanel = new MyDrawPanel();

		frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
		frame.getContentPane().add(BorderLayout.SOUTH, colorButton);
		frame.getContentPane().add(BorderLayout.EAST, labelButton);
		frame.getContentPane().add(BorderLayout.WEST, label);

		frame.setSize(300, 300);
		frame.setVisible(true);
	}
	class LabelListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			label.setText("Ouch!");   // внутренний класс знает о внешней label
		}
	}
	class ColorListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			frame.repaint();      //внутренний класс использует переменную экземпляра frame
									// без явной ссылки на объект внешнего класса
		}
	}
}
