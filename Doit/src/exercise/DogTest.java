package exercise;

public class DogTest {

	public static void main(String[] args) {
		Dog[] dog = new Dog[5];
		
		dog[0] = new Dog("�۸���","��Ƽ��");
		dog[1] = new Dog("�۸۱�","�ڽ���Ʈ");
		dog[2] = new Dog("�۸۾�","��������");
		dog[3] = new Dog("�۸�¯","������");
		dog[4] = new Dog("�۸���","����");
		
		
		for(int i=0;i<dog.length;i++) {
			System.out.println(dog[i].showDogInfo());
		}
		
		
		System.out.println("=== ���� for�� ===");
		for(Dog d : dog) {
			System.out.println(d.showDogInfo());
		}

	}

}
