package constructor;

public class PersonTest {

	public static void main(String[] args) {
		Person personLee = new Person();
		personLee.name = "박진우";
		personLee.height = 174.8f;
		personLee.weight = 78.6f;
		
		Person personKim = new Person("박진우", 175, 76);
		
		System.out.println(personKim.name);

	}

}
