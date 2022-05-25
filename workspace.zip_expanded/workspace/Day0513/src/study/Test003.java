package study;
import java.io.*;
public class Test003 {

	public static void main(String[] ar)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//int human = Integer.parseInt(ar[0]);//사람 수 구하기
		System.out.print("학생수 입력:");
		int human = Integer.parseInt(br.readLine());

		String[] name = new String[human];
		//String[] subject = new String[ar.length-1];// 과목명 초기화
		String[] subject = {"국어","영어","수학"};
		//점수와 총점 처리 배열선언
		int[][] jumsu = new int[human][subject.length];
		float[] avg = new float[human];
		char[] grade = new char[human];
		int[] rank = new int[human];
		
		
//		for(int i=0;i<ar.length-1;i++) {
//			subject[i] = ar[i+1];
//			System.out.println(subject[i]);
//		}
		
		
		for(int i=0;i<human;i++) {
			System.out.print((i+1)+"번째 학생 이름: ");
			name[i]=br.readLine();
			System.out.println(name[i]+"학생 점수 입력: ");
			for(int j=0;j<subject.length;j++) {
				System.out.print(subject[j]+"점수: ");
				jumsu[i][j]=Integer.parseInt(br.readLine());
			}
		}
	     
		
		
	}

}
