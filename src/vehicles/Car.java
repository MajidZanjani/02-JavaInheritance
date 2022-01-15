package vehicles;

public class Car extends Vehicle{

	String color;

	public Car(int id, String vehicleName, int vehicleSpeed, String color) {
		super(id, vehicleName, vehicleSpeed);
		this.color = color;
	}

}
