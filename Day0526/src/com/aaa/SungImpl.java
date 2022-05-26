package com.aaa;
import java.util.*;
public class SungImpl extends Record implements Sung {
	
	int in;
	Record re[];
	
	Scanner sc = new Scanner(System.in);
	


	@Override
	public void set() {// 인원수 입력받는 기능
		do {
			System.out.print("인원 수 입력: ");
			in = sc.nextInt();
		}while(in<1||in>100);
		
		re = new Record[in];
		

	}

	@Override
	public void input() {// 학번, 이름, 과목별 점수 입력기능, 판정
		
		for(int i=0;i<this.in;i++) {
			re[i] = new Record();
			System.out.printf("%d번째 학생의 학번 이름을 입력(공백 구분): ",(i+1));
			re[i].number=sc.nextInt();
			re[i].name=sc.next();
			
				System.out.print("국어 영어 수학 점수 입력(공백 구분): ");
				re[i].sco[0]=sc.nextInt();
				re[i].sco[1]=sc.nextInt();
				re[i].sco[2]=sc.nextInt();
				
				
				for(int j=0;j<re[i].sco.length;j++) {
					if(re[i].sco[j]>90) {
						re[i].scor[j]="수";
					}else if(re[i].sco[j]>=80) {
						re[i].scor[j]="우";
					}else if(re[i].sco[j]>=70) {
						re[i].scor[j]="미";
					}else if(re[i].sco[j]>=60) {
						re[i].scor[j]="양";
					}else {
						re[i].scor[j]="가";
					}
				}
				
				re[i].sum=(re[i].sco[0]+re[i].sco[1]+re[i].sco[2]);
				re[i].avg=re[i].sum/3;
			
			
		}
		

	}

	@Override
	public void print() {// 결과 출력
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
		System.out.println("학번  이름   국어  영어 수학 총점  평균 판정");
		
		sim.print();
		System.out.println("========================================");

	}

}
