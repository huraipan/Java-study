package study;

/*   ������ ���ڰ� ����ִ� �迭�� ���� �����͵� ��
 *    ¦���� ��Ҹ� ��� ���
 *    3�� ����� ��Ҹ� ��� ����ϴ� ���α׷��� �����Ͻÿ�.
 * 
 *    ������ ����: 4, 7, 9, 1, 3, 2, 5, 6, 8
 * 
 *     1. �迭�� õü ��� ���
 *     2.¦���� ���
 *     3. 3�� ����� ��� 
 * 
 */
public class Test002 {

	public static void main(String[] args) {
    int arr[] = new int[] {4,7,9,1,3,2,5,6,8};		
		
		
        for(int i=0;i<arr.length;i++) {
		System.out.println("arr["+i+"]: "+arr[i]);
        }
        System.out.println();
        
        for(int i=0;i<arr.length;i++) {
        	if(arr[i]%2==0) {
        		System.out.println("arr["+i+"]: "+arr[i]);
        	}
        }
		System.out.println();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%3==0) {
        		System.out.println("arr["+i+"]: "+arr[i]);
        	}
		}
		
		
		
		
		
		
		
	}

}
