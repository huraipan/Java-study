package com.awtex;
import java.awt.*;
import java.awt.event.*;

public class FrameEx01 extends WindowAdapter{
	 

	public static void main(String[] args) {
		// ������ ��ü ����
		Frame frame = new Frame();
		WinEvent we = new WinEvent();
		frame.addWindowListener(we);
		frame.setSize(300, 200);
		frame.setVisible(true);
		
		

	}

}
