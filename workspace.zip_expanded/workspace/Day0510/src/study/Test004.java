package study;

/*   [char] �ڷ��� �迭�� ���ĺ� �빮�ڸ� ä���,
 *   ä���� �迭�� ��ü ��Ҹ� ���
 *   
 *   ��, char �ڷ����� �迭�� �ʱ�ȭ�� �ݺ����� �̿���
 * 
 */

public class Test004 {

	public static void main(String[] args) {
    
    char[] ch= new char[26];
    
    
    for(int i=0;i<ch.length;i++) {
    	ch[i]=(char)(97+i);
    	System.out.print(ch[i]+" ");
    }
   
	System.out.println();
	
	char[] alpha = new char[26];
	for(int i=0;i<alpha.length;i++) {
		alpha[i]=(char)('A'+i);
		System.out.print(alpha[i]+" ");
	}
		

	}

}
