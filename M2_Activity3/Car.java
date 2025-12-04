package ph.com.bpi.hello;

public class Car {

	String brand = "default";
	String model = "default";
	String color = "default";

	public Car() {
		
	}
	
	public Car(String brand, String model, String color) {
		this.brand = brand;
		this.model = model;
		this.color = color;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
}
