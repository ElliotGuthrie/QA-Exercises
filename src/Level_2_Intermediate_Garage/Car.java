package Level_2_Intermediate_Garage;

public class Car extends Vehicle
{
	public int doorNumber;
	
	public Car(String vehicleType, String colour, int amountWheels, int age, int doorNumber, String idPlate) 
	{
		this.vehicleType = vehicleType;
		this.colour = colour;
		this.amountWheels = amountWheels;
		this.age = age;
		this.doorNumber = doorNumber;
		this.idPlate = idPlate;
	}
	public int getDoorNumber()
	{
		return doorNumber; 
	}
	public void setDoorNumber(int doorNumber) 
	{
		this.doorNumber = doorNumber;
	}
	public String toString()
	{
		return super.toString() + ", Number of Doors: " + this.doorNumber;
	}
}
