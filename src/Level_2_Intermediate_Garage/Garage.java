package Level_2_Intermediate_Garage;

import java.util.*;

public class Garage 
{
	public ArrayList<Vehicle> vehicles;
	
	public Garage() 
	{
		vehicles = new ArrayList<Vehicle>();
	}
	
	public static void main(String[] args) 
	{
		Vehicle car1 = new Car("Car", "Red", 3, 30, 3, "AB12 XYZ");
		Vehicle car2 = new Car("Car", "Blue", 4, 10, 5, "CD13 LMN");
		Vehicle car3 = new Car("Car", "Green", 4, 2, 5, "EF14 OPQ");
		
		Vehicle bike1 = new Motorbike("Motorbike", "Red", 2, 4, 1, "GH22 ZYX");
		Vehicle bike2 = new Motorbike("Motorbike", "Blue", 2, 4, 2, "IJ23 NML");
		Vehicle bike3 = new Motorbike("Motorbike", "Green", 3, 6, 2, "KL24 QPO");
		
		Vehicle lorry1 = new Lorry("Lorry", "Red", 6, 7, 24, "MN32 ABC");
		Vehicle lorry2 = new Lorry("Lorry", "Blue", 10, 9, 27, "OP33 DEF");
		Vehicle lorry3 = new Lorry("Lorry", "Green", 8, 7, 25, "QR34 GHI");
		
		Garage garage = new Garage();
		
		garage.addVehicle(car1);
		garage.addVehicle(car2);
		garage.addVehicle(car3);
		garage.addVehicle(bike1);
		garage.addVehicle(bike2);
		garage.addVehicle(bike3);
		garage.addVehicle(lorry1);
		garage.addVehicle(lorry2);
		garage.addVehicle(lorry3);
		
		//Comment out/change order to view the separate functions
		garage.removeVehicleID("AB12 XYZ");
		garage.removeVehicleType("Car");
		garage.newGarage();	
		garage.repairCost();
	}
	public void addVehicle(Vehicle vehicle)
	{
		this.vehicles.add(vehicle);
	}
	public void removeVehicleID(String id)
	{
		int idx = 0;

		while (idx < vehicles.size())
		{
		   if(vehicles.get(idx).getIdPlate().equals(id))
		   {
			   vehicles.remove(idx);
		   }
		   else
		   {
			   ++idx;
		   }
		}
	}
	public void removeVehicleType(String type)
	{
		int idx = 0;

		while (idx < vehicles.size())
		{
		   if(vehicles.get(idx).getVehicleType().equals(type))
		   {
			   vehicles.remove(idx);
		   }
		   else
		   {
			   ++idx;
		   }
		}
	}
	public void newGarage()
	{
		vehicles = new ArrayList<Vehicle>();
	}
	public void repairCost()
	{
		for(int i = 0; i < vehicles.size(); i++)
		{
			Vehicle vehicle = vehicles.get(i);
			System.out.println(vehicle);
			
			if(vehicle instanceof Car)
			{
				Car car = (Car)vehicle;
				System.out.println("The repair cost for this Car will be £" + vehicle.amountWheels * vehicle.age * car.doorNumber);
			}
			else if(vehicle instanceof Motorbike)
			{
				Motorbike bike = (Motorbike)vehicle;
				System.out.println("The repair cost for this Car will be £" + vehicle.amountWheels * vehicle.age * bike.numberSeats);
			}
			else if(vehicle instanceof Lorry)
			{
				Lorry lorry = (Lorry)vehicle;
				System.out.println("The repair cost for this Car will be £" + vehicle.amountWheels * vehicle.age * lorry.trailerSize);
			}
			else
			{
				System.out.println("The inputted vehicle type is invalid.");
			}
		}
	}
}
