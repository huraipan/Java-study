package study;

/*
 *  ��]
 *  �迭�� �̿��Ͽ� �Ѹ��� �л��� ���� ����ó�� ���α׷��� �ۼ��Ѵ�.
 *  
 *  ���� ��, �����,
 *  �̸��� �Է�
 *  
 *  
 *  �̸�, �����, ����, ���, ����
 *  
 */
import java.io.*;
public class Test002 {

	public static void main(String[] ar)throws IOException {

		
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		if(ar.length==0) {
			System.exit(0);
		}
		
		for(int i=0;i<ar.length;i++) {
	
		}
		
		
		String name = br.readLine();
//		String[] subject = new String[ar.length];
		String[] subject = {"����", "����", "����"};
		
		for(int i=0;i<ar.length;i++) {
			subject[i]=ar[i];
//			System.out.print(subject[i]+"  ");
		}

        int jumsu[]= new int[subject.length+1];
        
        for(int i=0;i<subject.length;i++) {
        	System.out.print(subject[i]+"����: ");
        	jumsu[i] = Integer.parseInt(br.readLine());
        	jumsu[jumsu.length-1]+=jumsu[i];
        }
	
         
	
	}

}
