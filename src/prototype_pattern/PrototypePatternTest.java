package prototype_pattern;

public class PrototypePatternTest {
	public static void mian(String[] args) throws CloneNotSupportedException {
		System.out.println("*** Prototype Pattern Demo***");
		
		BasicCar nano = new Nano("Green Nano");
		nano.basePrice = 100000;
		
		BasicCar ford = new Nano("Ford Yellow");
		ford.basePrice = 100000;
		
		BasicCar bc1;
		
		bc1 = nano.clone();
		
		bc1.onRoadPrice = nano.basePrice + BasicCar.setrAdditionalPrice();
		
		System.out.println("Car is: " + bc1.modelName + " and its pricce is " + bc1.onRoadPrice);
	
		bc1 = ford.clone();
		
		bc1.onRoadPrice = ford.basePrice + BasicCar.setrAdditionalPrice();
		
		System.out.println("Car is: " + bc1.modelName + " and its pricce is " + bc1.onRoadPrice);
	
	
	}

}
