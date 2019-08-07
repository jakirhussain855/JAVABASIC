package object;

public class Execution {
	//Naming Convention
	//PackageName/variable name-starts with lower case
	//Class -starts with Upper case
	//
	
	
	public static void main(String[] args) {
		
		// Object Creation;every time you make variable u name it as same variable name  as Laptop we put lower case laptop;
		Laptop laptop=new Laptop();
		Car car=new Car();
		System.out.println(laptop.brand);
		System.out.println(laptop.model);
		System.out.println(laptop.production_year);
		System.out.println(car.brand);
		System.out.println(car.color);
	}

}
