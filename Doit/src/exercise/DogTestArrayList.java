package exercise;
import java.util.ArrayList;
public class DogTestArrayList {

	public static void main(String[] args) {
		ArrayList<Dog> dog = new ArrayList<Dog>();
		
		dog.add(new Dog("�۸���","��Ƽ��"));
		dog.add(new Dog("�۸۱�","�ڽ���Ʈ"));
		dog.add(new Dog("�۸۾�","��������"));
		dog.add(new Dog("�۸�¯","������"));
		dog.add(new Dog("�۸���","����"));
		
		for(int i=0;i<dog.size();i++) {
			System.out.println(dog.get(i).showDogInfo());
		}
		
		for(Dog d : dog) {
			System.out.println(d.showDogInfo());
		}

	}

}
