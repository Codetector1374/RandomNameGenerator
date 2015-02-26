package cn.codetector.RandomNameGen;

import javax.swing.JFrame;

import cn.codetector.RandomNameGen.Window.MainWindow;

public class NameGenMain {
	public static void main(String args[]){
		MainWindow mw = new MainWindow();
		mw.CreateWindow();
		mw.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mw.setBounds(0, 0, 400, 200);
	}
}
