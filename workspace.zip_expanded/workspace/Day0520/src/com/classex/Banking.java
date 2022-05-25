package com.classex;
import java.io.*;
public class Banking {

	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		Account na = new Account("홍길동");
		
		String strWork;
		
		do {
			System.out.println("\n 작업을 선택하세요");
			System.out.println("============================");
			System.out.println("입      금  ===============>1");
			System.out.println("출      금  ===============>2");
			System.out.println("잔 액 확 인  ===============>3");
			System.out.println("종      료  ===============>0");
			System.out.println("============================");
			
			System.out.print("작업 내용을 선택하세요: ");
			strWork = br.readLine();
			
			int switchInt=0;
			
			if(strWork!=null) {// null이 아닐 때 메뉴가 선택 되었을 경우
				switchInt=Integer.parseInt(strWork);
			}else {// null일때
				System.out.println("작업 내용을 입력하지 않으셨습니다.");
				System.exit(0);
				
			}
			
			
			
			switch(switchInt) {
			
			case 0:// 종료
				System.out.println("프로그램을 종료합니다");
				break;
			case 1: // 입금
				
				System.out.println("\n =======================");
				System.out.println("입금하실 금액을 입력하세요: ");
				String strdepositIn=br.readLine();
				long depositLong = Long.parseLong(strdepositIn);
				na.deposit(depositLong);
				break;
			case 2: // 출금
				
				System.out.println("\n =======================");
				System.out.println("cnfrma하실 금액을 입력하세요: ");
				String strwithdraw=br.readLine();
				long withdraw = Long.parseLong(strwithdraw);
				na.withdraw(withdraw);
				break;
				
			case 3:
				System.out.println(na.getName()+"님의 잔고는"+na.getBlalance()+"원 입니다.");
				default :
					System.out.println("0~3 사이의 숫자를 입력하세요\n");
					break;
			
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
		}while(!strWork.equals("0"));
		
		
		
		
		
		
		
		

	}

}
