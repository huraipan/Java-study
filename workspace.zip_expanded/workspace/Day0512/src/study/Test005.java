package study;
import java.io.*;
public class Test005 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] subname= {"국어", "영어","수학"};
		int [][][] sub = new int[2][3][subname.length+3];
		float[][] avg = new float[2][3];
		
		for(int h=0;h<sub.length;h++) {
			for(int i=0;i<sub[h].length;i++) {
				for(int j=0;j<sub[h][i].length-3;j++) {
					do {
						System.out.print(subname[i]+"점수: ");
						sub[h][i][j]=Integer.parseInt(br.readLine());
					}while(sub[h][i][j]<0||sub[h][i][j]>100);
					sub[h][i][sub[h][i].length-3]+=sub[h][i][j];
				}
				avg[h][i]=sub[h][i][sub[h][i].length-3]/(float)(sub[h][i].length-3);
				sub[h][i][sub[h][i].length-2]=1;
				sub[h][i][sub[h][i].length-1]=1;
			}
		}
		for(int h=0;h<sub.length;h++) {
			
		for(int i=0;i<sub[h].length;i++) {
			for(int j=0;j<sub[h].length;j++) {
				if(sub[h][i][sub[h][i].length-3]<sub[h][j][sub[h][j].length-3]) {
					sub[h][i][sub[h][i].length-2]++;
				}
			}
		}
		}
		
		
		for(int h=0;h<sub.length;h++) {
			for(int i=0;i<sub[h].length;i++) {
				System.out.println();
				System.out.println("총점: "+sub[h][i][sub[h][i].length-3]);
				System.out.println("평균: "+avg[h][i]);
				System.out.println("반석차: "+sub[h][i]);
			}
		}
		
		
		
		
		
		
		
	}

}
