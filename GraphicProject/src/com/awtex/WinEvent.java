package com.awtex;
import java.awt.*;
import java.awt.event.*;
public class WinEvent  extends WindowAdapter{
	@Override
	   public void windowClosing(WindowEvent e) {
	      System.exit(0);
	   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
