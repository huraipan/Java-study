package exercise;
import java.util.ArrayList;
public class DogTestArrayList {

	public static void main(String[] args) {
		ArrayList<Dog> dog = new ArrayList<Dog>();
		
		dog.add(new Dog("港港捞","富萍令"));
		dog.add(new Dog("港港焙","蹿胶绕飘"));
		dog.add(new Dog("港港剧","档海福父"));
		dog.add(new Dog("港港炉","柳稻俺"));
		dog.add(new Dog("港港洒","棱辆"));
		
		for(int i=0;i<dog.size();i++) {
			System.out.println(dog.get(i).showDogInfo());
		}
		
		for(Dog d : dog) {
			System.out.println(d.showDogInfo());
		}

	}

}
