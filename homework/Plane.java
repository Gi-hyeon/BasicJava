package homework;

public class Plane {
	private String manufacturer;
	private String model;
	private int maxNumberOfPassengers;
	private static int numberOfPlanes;
	
	public Plane() {
		numberOfPlanes++;
	}
	
	public Plane(String manufacturer, String model, int maxNumberOfPassengers) {
		this();
		this.manufacturer = manufacturer;
		this.model = model;
		this.maxNumberOfPassengers = maxNumberOfPassengers;
	}
	
	public String getManufacture() {
		return manufacturer;
	}
	
	public void setManufacture(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public int getMaxNumberOfPassengers() {
		return maxNumberOfPassengers;
	}
	
	public void setMaxNumberOfPassengers(int maxNumberOfPassengers) {
		if(maxNumberOfPassengers < 0) {
			this.maxNumberOfPassengers = 0;
		} else {
			this.maxNumberOfPassengers = maxNumberOfPassengers;
		}
	}
	
	public static int getNumberOfPlanes() {
		return numberOfPlanes;
	}
	
	public String toString() {
		return null;
	}
}
