package com.awtex;
import java.awt.*;
import java.awt.event.*;
public class WindowEventEx03 extends Frame{
	
	public WindowEventEx03() {
		super("WinEvent3");
		addWindowListener(this);
		setSize(300, 200);
		setVisible(true);
	}
	
	class WinEventEx extends WindowAdapter {
		@Override
		public void windowClosing(WindowEvent e) {
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
