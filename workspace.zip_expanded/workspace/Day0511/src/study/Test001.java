package study;

public class Test001 {

	public static void main(String[] args) {

    int[] score = new int[5];
    int j=1;
    score[0] = 10;
    score[1] = 10;
    score[j+1] = 10;
    score[3] = 10;
    score[4] = 10;
    
//    System.out.println(score);
    int sum=0;
        for(int i=0;i<score.length;i++) {
        	sum+=score[i];
        }
        
        System.out.println(sum);
         
         
           
           
          
            
        
         
        
        
        
	}

}
