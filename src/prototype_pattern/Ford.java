package prototype_pattern;

public class Ford extends BasicCar{
	
	private int basePrice = 100000;
	
	public Ford(String m) {
		modelName = m;
	}
	
	@Override
	public BasicCar clone() throws CloneNotSupportedException {
		return (Ford)super.clone();
	}

}
