package vectorex;
import java.util.*;
public class VectorEx03 {
	
	private static final String colors[] = {
			"����","���","���","�Ķ�","��Ȳ","����","����"
	};

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		
		for(String str : colors) {
			v.add(str);
		}
		
		
		System.out.println("ù��° ���: "+v.firstElement());
		System.out.println("����° ���: "+v.get(2));
		System.out.println("������ ���: "+v.lastElement());
		for(String str : colors) {
			System.out.print(str);
		}

	}

}
