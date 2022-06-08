package vectorex;
import java.util.*;
public class VectorEx03 {
	
	private static final String colors[] = {
			"검정","노랑","녹색","파랑","주황","연두","보라"
	};

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		
		for(String str : colors) {
			v.add(str);
		}
		
		
		System.out.println("첫번째 요소: "+v.firstElement());
		System.out.println("세번째 요소: "+v.get(2));
		System.out.println("마지막 요소: "+v.lastElement());
		for(String str : colors) {
			System.out.print(str);
		}

	}

}
