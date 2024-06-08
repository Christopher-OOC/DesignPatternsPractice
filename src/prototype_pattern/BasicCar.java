package prototype_pattern;

import java.util.Random;

public abstract class BasicCar implements Cloneable {
	
	public String modelName;
	
	public int basePrice;
	
	public int onRoadPrice;

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public int getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(int basePrice) {
		this.basePrice = basePrice;
	}

	public int getOnRoadPrice() {
		return onRoadPrice;
	}

	public void setOnRoadPrice(int onRoadPrice) {
		this.onRoadPrice = onRoadPrice;
	}
	
	public static int setrAdditionalPrice() {
		int price = 0;
		
		Random r = new Random();
		
		int p = r.nextInt(100000);
		price = p;
		
		return price;
	}
	
	public BasicCar clone() throws CloneNotSupportedException {
		return (BasicCar)super.clone();
	}

}
