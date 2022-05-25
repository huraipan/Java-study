package study;

/*
 *  문]
 *  배열을 이용하여 한명의 학새에 대한 성적처리 프로그램을 작성한다.
 *  
 *  과목 수, 과목명,
 *  이름도 입력
 *  
 *  
 *  이름, 과목명, 총점, 평균, 학점
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
		String[] subject = {"국어", "영어", "수학"};
		
		for(int i=0;i<ar.length;i++) {
			subject[i]=ar[i];
//			System.out.print(subject[i]+"  ");
		}

        int jumsu[]= new int[subject.length+1];
        
        for(int i=0;i<subject.length;i++) {
        	System.out.print(subject[i]+"점수: ");
        	jumsu[i] = Integer.parseInt(br.readLine());
        	jumsu[jumsu.length-1]+=jumsu[i];
        }
	
         
	
	}

}
