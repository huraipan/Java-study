package study;
import java.io.*;
public class Test003 {

	public static void main(String[] ar)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//int human = Integer.parseInt(ar[0]);//��� �� ���ϱ�
		System.out.print("�л��� �Է�:");
		int human = Integer.parseInt(br.readLine());

		String[] name = new String[human];
		//String[] subject = new String[ar.length-1];// ����� �ʱ�ȭ
		String[] subject = {"����","����","����"};
		//������ ���� ó�� �迭����
		int[][] jumsu = new int[human][subject.length];
		float[] avg = new float[human];
		char[] grade = new char[human];
		int[] rank = new int[human];
		
		
//		for(int i=0;i<ar.length-1;i++) {
//			subject[i] = ar[i+1];
//			System.out.println(subject[i]);
//		}
		
		
		for(int i=0;i<human;i++) {
			System.out.print((i+1)+"��° �л� �̸�: ");
			name[i]=br.readLine();
			System.out.println(name[i]+"�л� ���� �Է�: ");
			for(int j=0;j<subject.length;j++) {
				System.out.print(subject[j]+"����: ");
				jumsu[i][j]=Integer.parseInt(br.readLine());
			}
		}
	     
		
		
	}

}
