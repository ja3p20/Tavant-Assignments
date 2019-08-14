package day1;

class Car {
	private int gearNumber = 0;
	
	public Car() {}
	
	public Car(int gearNumber) {
		this.gearNumber = gearNumber;
	}
	
	public void changeGear() {
		this.gearNumber+=1;
		System.out.println("Change gear called : Shifting gear to "+ gearNumber);
	}
	public void applyBrakes() {
		if (this.gearNumber==0) {
			System.out.println("Your vehicle is already in the stop stage");
		}
		this.gearNumber-=1;
		System.out.println("Deaccelerating your vehicle and Gearing down to "+gearNumber);
	}
	public void applyNitros() {
		if(this.gearNumber > 5) {
			System.out.println("Nitros mode on");
		} else {
			System.out.println("Please change the gear to 6 to apply nitros");
		}
	}
}
class Mobile{
	private String model;
	private int cost;
	
	public Mobile (String model, int cost) {
		this.model = model;
		this.cost = cost;
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
}
class Cat{
	private String nickName;
	private int age;
	
	public Cat() {}
	public Cat(String nickName, int age) {
		this.nickName = nickName;
		this.age = age;
	}
	public void catInfo() {
		System.out.println("Your cats nickname is "+nickName+ " and age is " +age);
	}
	
	
}
public class Oopdemo {

	public static void main(String[] args) {
		Car porsche = new Car(2);
		Car lamborghini = new Car(6);
		
		porsche.changeGear();
		porsche.applyBrakes();
		porsche.applyNitros();
	
		lamborghini.changeGear();
		lamborghini.applyBrakes();
		lamborghini.applyNitros();
		
		Mobile pixel = new Mobile("Pixel 4a",35000);
		Mobile oneplus = new Mobile("One Plus 6",29000);
		System.out.println(pixel.getModel());
		System.out.println(oneplus.getCost());
		
		
		Cat firstcat = new Cat("Pikachu",4);	
		Cat secondcat = new Cat("Mewtwo",1);
		firstcat.catInfo();
		secondcat.catInfo();
		
	}

}

