package com.awtex;
import java.awt.*;
public class CheckboxEx extends Frame{
	
	private Label lb = new Label("�����ϴ� ����??");
	private Button bt = new Button("Ȯ��");
	
	private Checkbox[] cb = {
			new Checkbox("�ٳ���"),
			new Checkbox("���"),
			new Checkbox("���ξ���"),
			new Checkbox("����", true)
	};
	
	
	
	
	
	
	public CheckboxEx() {
		
		super("Checkbox");
		setLayout(new GridLayout(6, 1));
		add(lb);
		for(int i=0; i<4; i++) {
			add(cb[i]);
		}
		
		add(bt);
		
		
		
		
		
		
		
		WinEvent we = new WinEvent();
		addWindowListener(we);
		setSize(300, 200);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new CheckboxEx();

	}

}
