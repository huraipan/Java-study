package vectorex;
import java.util.*;
public class VectorEx01 {

	
	private static final String colors[]= {
			"����", "���", "���", "û��", "����", "����"};
	
	
	
	public static void main(String[] args) {
		
		int i;
		String str;
		Vector<String> v = new Vector<>();
		for(i=0;i<colors.length;i++) {
			v.add(colors[i]);
			
			
			System.out.println("��ü ���");
			Iterator<String> it = v.iterator();
			while(it.hasNext()) {
				str = it.next();
				System.out.print(str+" ");
			}
		}
		

	}

}
