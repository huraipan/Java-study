package com.aaa;
import java.util.*;
public class SungImpl extends Record implements Sung {
	
	int in;
	Record re[];
	
	Scanner sc = new Scanner(System.in);
	


	@Override
	public void set() {// �ο��� �Է¹޴� ���
		do {
			System.out.print("�ο� �� �Է�: ");
			in = sc.nextInt();
		}while(in<1||in>100);
		
		re = new Record[in];
		

	}

	@Override
	public void input() {// �й�, �̸�, ���� ���� �Է±��, ����
		
		for(int i=0;i<this.in;i++) {
			re[i] = new Record();
			System.out.printf("%d��° �л��� �й� �̸��� �Է�(���� ����): ",(i+1));
			re[i].number=sc.nextInt();
			re[i].name=sc.next();
			
				System.out.print("���� ���� ���� ���� �Է�(���� ����): ");
				re[i].sco[0]=sc.nextInt();
				re[i].sco[1]=sc.nextInt();
				re[i].sco[2]=sc.nextInt();
				
				
				for(int j=0;j<re[i].sco.length;j++) {
					if(re[i].sco[j]>90) {
						re[i].scor[j]="��";
					}else if(re[i].sco[j]>=80) {
						re[i].scor[j]="��";
					}else if(re[i].sco[j]>=70) {
						re[i].scor[j]="��";
					}else if(re[i].sco[j]>=60) {
						re[i].scor[j]="��";
					}else {
						re[i].scor[j]="��";
					}
				}
				
				re[i].sum=(re[i].sco[0]+re[i].sco[1]+re[i].sco[2]);
				re[i].avg=re[i].sum/3;
			
			
		}
		

	}

	@Override
	public void print() {// ��� ���
		// TODO Auto-generated method stub
		for(int i=0;i<this.in;i++)
		System.out.println(re[i].number+" "+re[i].name+"  "+re[i].sco[0]+"  "+re[i].sco[1]+"  "+
		re[i].sco[2]+"  "+re[i].sum+"  "+re[i].avg+"  "+re[i].scor[0]+" "+re[i].scor[1]+" "+re[i].scor[2]);

	}

	public static void main(String[] args) {
		SungImpl sim = new SungImpl();
		sim.set();
		sim.input();
		System.out.println("========================================");
		System.out.println("�й�  �̸�   ����  ���� ���� ����  ��� ����");
		
		sim.print();
		System.out.println("========================================");

	}

}
