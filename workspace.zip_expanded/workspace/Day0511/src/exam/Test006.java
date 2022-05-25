package exam;
/*  배열을 활용하여 최대값과 최소값
 * 
 */
public class Test006 {

	public static void main(String[] args) {
    int[] num = {79,88,91,33,100,55,95};
    int max=num[0], min=num[0];
    
    
    for(int i=1;i<num.length;i++) {
    	if(num[i]>max) {
    		max=num[i];
    	}else if(num[i]<min) {
    		min=num[i];
    	}
    }System.out.printf("최대값: %d\n최소값: %d",max, min);

	}

}
