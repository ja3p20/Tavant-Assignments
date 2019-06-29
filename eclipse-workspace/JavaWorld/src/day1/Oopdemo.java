package day1;

class Car {
	int numOfWheels;
	String bodytype;
	
	void changeGear() {}
	void applybrakes() {}
	void applynitros() {}
}
class Mobile{
	float ramsize;
	String body;
	String OSname;
	
	void call() {}
	void disconnect() {}
	boolean isEarphoneAttached() {
		return false;
	}
}
class Cat{
	String name;
	int age;
	void playtime() {}
	
}
public class Oopdemo {

	public static void main(String[] args) {
		Car carobj1 = new Car();
		Car carobj2 = new Car();
		Mobile mobobj1 = new Mobile();
		Mobile mobobj2 = new Mobile();
		Cat catobj = new Cat();
		//Cat catobj2 = new Cat();
		
		carobj1.applybrakes();
		carobj2.changeGear();
		
		mobobj1.call();
		mobobj2.disconnect();
		
		catobj.playtime();
	}

}

