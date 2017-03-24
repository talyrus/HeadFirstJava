package com.taly.SimpleAnimation;
import com.taly.SimpleGui1.SimpleGui1;

import javax.swing.*;
import java.awt.*;
/**
 * Created by Taly on 24.03.2017.
 */
public class SimpleAnimation {
	int x = 70;   // создаем два поля в главном классе GUI для координат x и y круга
	int y = 70;

	public static void main(String[] args) {
		SimpleAnimation gui = new SimpleAnimation();
		gui.go();
	}
	public void go() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyDrawPanel drawPanel = new MyDrawPanel();
		frame.getContentPane().add(drawPanel);
		frame.setSize(300, 300);
		frame.setVisible(true);

		for (int i = 0; i < 130; i++) {
			x++;
			y++;
			drawPanel.repaint();
			try {
				Thread.sleep(50);
			} catch (Exception e){};

		}
	}
	class MyDrawPanel extends JPanel {
		public void paintComponent(Graphics g) {
			//установим фоновый цвет панели рисования
			g.setColor(Color.white);
			// заполнит весь прямоугольник этим цветом
			g.fillRect(0, 0, this.getWidth(), this.getHeight()); // методы унаследованы от JPanel

			//создадим меняющийся цвет круга
			int red = (int) (Math.random() * 255);
			int green = (int) (Math.random() * 255);
			int blue = (int) (Math.random() * 255);
			Color randomColor = new Color(red, green, blue);
			g.setColor(randomColor);
			//
			//g.setColor(Color.green);
			// используем постоянно обновляющиеся координаты x и y внешнего класса
			g.fillOval(x, y, 40, 40);
		}
	} //Закрываем внутренний класс
}// закрываем внешний класс
