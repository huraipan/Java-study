package com.awtex;
import java.awt.*;
public class TextEx extends Frame{
	
	private TextField tf = new TextField("����: ");
	private TextArea ta = new TextArea("�޸�", 5, 10);
	
	private Button bt = new Button("Ȯ��");
	private Label la = new Label("����");
	
	

	
	
	
	
	
	public TextEx() {
		
		
		super("TextField");
		setLayout(new BorderLayout());
		
		add("North", tf);
		add("South",bt);
		add("Center", ta);
		add("West", la);
		
		
		
		
		WinEvent we = new WinEvent();
		addWindowListener(we);
		setSize(300, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new TextEx();

	}

}