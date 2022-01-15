package vehicles;

public class RaceCar extends Car{

	int wins;

	public RaceCar(int id, String vehicleName, int vehicleSpeed, String color, int wins) {
		super(id, vehicleName, vehicleSpeed, color);
		this.wins = wins;
	}

	public void display() {
		System.out.println("vehicleName: " + this.vehicleName);
		System.out.println("vehicleSpeed: " + this.vehicleSpeed);
		System.out.println("color: " + this.color);
		System.out.println("wins: " + this.wins);
	}
	
}
