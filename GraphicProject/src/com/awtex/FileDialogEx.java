package com.awtex;
import java.awt.*;
public class FileDialogEx extends Frame{
	
	
	
	FileDialog fd = new FileDialog(this, "���� ����", FileDialog.SAVE);
	
	
	
	
	
	public FileDialogEx() {
		
		super("FileDialog �׽�Ʈ");
		
		
		
		
		
		WinEvent we = new WinEvent();
		addWindowListener(we);
		setSize(300, 200);		
		setVisible(true);
		fd.setVisible(true);
		System.out.println(fd.getFile());
		System.out.println(fd.getDirectory());
	}

	public static void main(String[] args) {
		new FileDialogEx();

	}

}
