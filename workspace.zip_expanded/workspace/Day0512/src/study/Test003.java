package study;
import java.io.*;
public class Test003 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] subname= {"국어","영어","수학"};
		
		int[][] sub = new int[3][subname.length+1];
		float[] avg = new float[3];
		
		
		for(int i=0;i<sub.length;i++) {
			for(int j=0;j<sub[i].length-1;j++) {
				do {
					System.out.print(subname[j]+"점수: ");
					sub[i][j]=Integer.parseInt(br.readLine());
				}while(sub[i][j]<0||sub[i][j]>100);
				sub[i][sub[i].length-1] +=sub[i][j];
			}
			avg[i] = (sub[i][sub[i].length-1])/(float)(sub[i].length-1);
		}
		
		
		for(int i=0;i<sub.length;i++) {
			System.out.println();
			System.out.println("총점: "+sub[i][sub[i].length-1]);
			System.out.println("평균: "+avg[i]);
		}
		
		
		
		

	}

}
