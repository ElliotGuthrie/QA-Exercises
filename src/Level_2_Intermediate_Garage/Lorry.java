package Level_2_Intermediate_Garage;

public class Lorry extends Vehicle 
{
	public int trailerSize;
	
	public Lorry(String vehicleType, String colour, int amountWheels, int age, int trailerSize, String idPlate) 
	{
		this.vehicleType = vehicleType;
		this.colour = colour;
		this.amountWheels = amountWheels;
		this.age = age;
		this.trailerSize = trailerSize;
		this.idPlate = idPlate;
	}
	public int getTrailerSize() 
	{
		return trailerSize;
	}
	public void setTrailerSize(int trailerSize)
	{
		this.trailerSize = trailerSize;
	}
	public String toString()
	{
		return super.toString() + ", Size of Trailer(m): " + this.trailerSize;
	}
}
