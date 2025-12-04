package ph.com.bpi.hello;

public class M2_Acitivity3 {

	public static void main(String[] args) {
		Car car = new Car();
		car.setBrand("Mitsubishi");
		car.setModel("Mirage");
		car.setColor("Red");
		
		System.out.println("Car brand is: " + car.getBrand());
		System.out.println("Car model is: " + car.getModel());
		System.out.println("Car color is: " + car.getColor());
		
		Car car2 = new Car("Honda","Civic","Black");
		System.out.println("Car brand is: " + car2.brand);
		System.out.println("Car model is: " + car2.model);
		System.out.println("Car color is: " + car2.color);
		
		Car car3 = new Car();
		System.out.println("Car brand is: " + car3.brand);
		System.out.println("Car model is: " + car3.model);
		System.out.println("Car color is: " + car3.color);
	}

}
