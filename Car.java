package DR8Zad1;

public class Car {
	private String strCarModel;
	private int iCarSpeed;
	
	public Car(String model, int speed) {
		this.strCarModel = model;
		this.iCarSpeed=speed;
	}
	 @Override
	    public String toString() {
	        return String.format("%s %d", this.strCarModel, this.iCarSpeed);
	    }
}
