package Level_2_Intermediate_Garage;

public class Vehicle 
{
	String vehicleType;
	String colour;
	int amountWheels;
	String manufacturor;
	int horsepower;
	String fuelType;
	int age;
	String model;
	String idPlate;
	
	public String getVehicleType() 
	{
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) 
	{
		this.vehicleType = vehicleType;
	}
	public String getColour() 
	{
		return colour;
	}
	public void setColour(String colour) 
	{
		this.colour = colour;
	}
	public int getAmountWheels()
	{
		return amountWheels;
	}
	public void setAmountWheels(int amountWheels) 
	{
		this.amountWheels = amountWheels;
	}
	public String getManufacturor() 
	{
		return manufacturor;
	}
	public void setManufacturor(String manufacturor) 
	{
		this.manufacturor = manufacturor;
	}
	public int getHorsepower() 
	{
		return horsepower;
	}
	public void setHorsepower(int horsepower) 
	{
		this.horsepower = horsepower;
	}
	public String getFuelType() 
	{
		return fuelType;
	}
	public void setFuelType(String fuelType) 
	{
		this.fuelType = fuelType;
	}
	public int getAge() 
	{
		return age;
	}
	public void setAge(int age) 
	{
		this.age = age;
	}
	public String getModel() 
	{
		return model;
	}
	public void setModel(String model) 
	{
		this.model = model;
	}
	public String getIdPlate() 
	{
		return idPlate;
	}
	public void setIdPlate(String idPlate) 
	{
		this.idPlate = idPlate;
	}
	public String toString()
	{
		return "Vehicle Type: " + this.vehicleType + ", Colour: " + this.colour + ", Wheels: " + this.amountWheels + ", Age(years): " + this.age + ", ID Plate: " + this.idPlate;
	}
}
