package Level_2_Intermediate_Garage;

public class Motorbike extends Vehicle
{
	public int numberSeats;
	
	public Motorbike(String vehicleType, String colour, int amountWheels, int age, int numberSeats, String idPlate) 
	{
		this.vehicleType = vehicleType;
		this.colour = colour;
		this.amountWheels = amountWheels;
		this.age = age;
		this.numberSeats = numberSeats;
		this.idPlate = idPlate;
	}
	public int getNumberSeats() 
	{
		return numberSeats;
	}
	public void setNumberSeats(int numberSeats)
	{
		this.numberSeats = numberSeats;
	}
	public String toString()
	{
		return super.toString() + ", Number of Seats: " + this.numberSeats;
	}
}
