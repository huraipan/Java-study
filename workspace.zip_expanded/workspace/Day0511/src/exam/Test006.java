package exam;
/*  �迭�� Ȱ���Ͽ� �ִ밪�� �ּҰ�
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
    }System.out.printf("�ִ밪: %d\n�ּҰ�: %d",max, min);

	}

}
