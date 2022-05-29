package exercise;

public class DogTest {

	public static void main(String[] args) {
		Dog[] dog = new Dog[5];
		
		dog[0] = new Dog("港港捞","富萍令");
		dog[1] = new Dog("港港焙","蹿胶绕飘");
		dog[2] = new Dog("港港剧","档海福父");
		dog[3] = new Dog("港港炉","柳稻俺");
		dog[4] = new Dog("港港洒","棱辆");
		
		
		for(int i=0;i<dog.length;i++) {
			System.out.println(dog[i].showDogInfo());
		}
		
		
		System.out.println("=== 氢惑等 for巩 ===");
		for(Dog d : dog) {
			System.out.println(d.showDogInfo());
		}

	}

}
