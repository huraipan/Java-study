package com.awtex;
import java.awt.*;
public class ChoicEx extends Frame{
	
	private Label la = new Label("����");
	private Button bt = new Button("Ȯ��");
	private Choice co = new Choice();
    
	
	
	
	
	
	
	
	
	public ChoicEx() {
		
		super("Choic");
		setLayout(new GridLayout(3, 1));
		add(la);
		
		for(int i=0; i<=12; i++) {
			co.add(String.valueOf(i)+"��");
		}
		
		add(co);
		add(bt);
		
		
		
		
		WinEvent we = new WinEvent();
		addWindowListener(we);
		setSize(300, 200);
		//pack();
		setVisible(true);
	}

	public static void main(String[] args) {
		new ChoicEx();

	}

}
