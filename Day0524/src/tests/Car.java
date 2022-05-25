package tests;

class Car1 {
	int d = 0;
	int b = 100;
	static Car1 instance;

	public static Car1 getInstance() {
		if (instance == null) {
			instance = new Car1();
		}
		return instance;
	}

	public void dispDistance() {
		System.out.println("주행거리는: " + this.d + "km");
	}

	public void dispBatterty() {
		System.out.println("배터리: " + this.b + "%");
	}

	public void drive() {
		this.d += 1;
		this.b -= 10;

	}

}

public class Car {

	public static void main(String[] args) {
		Car1 c = Car1.getInstance();
		c.drive();
		c.dispDistance();
		c.dispBatterty();
		c.drive();
		c.dispDistance();
		c.dispBatterty();
		c.drive();
		c.dispDistance();
		c.dispBatterty();

	}

}
