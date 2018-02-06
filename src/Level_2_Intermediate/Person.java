package Level_2_Intermediate;

import java.util.*;

public class Person 
{
	private String name;
	private int age;
	private String jobTitle;
	
	public static void main(String[] args)
	{
		Person john = new Person();
		Person hannah = new Person();
		Person lucy = new Person();
		
		john.setName("John");
		john.setAge(26);
		john.setJobTitle("Janitor");
		
		hannah.setName("Hannah");
		hannah.setAge(35);
		hannah.setJobTitle("General Manager");
		
		lucy.setName("Lucy");
		lucy.setAge(72);
		lucy.setJobTitle("Retired");
		
		ArrayList<Person> people = new ArrayList<Person>();
		
		people.add(john);
		people.add(hannah);
		people.add(lucy);
		
		//Second print method, printing full contents of the ArrayList.
		//System.out.println("Currently the array list has stored: " + people);
		
		for(int i = 0; i < people.size(); i++)
		{
			System.out.println(people.get(i));
		}
		
		//Original toString print method, before populating ArrayList.
		//System.out.println(john.toString());
		//System.out.println(hannah.toString());
		//System.out.println(lucy.toString());
		
		searchName("John", people);
		searchName("Nathan", people);
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}
	public void setAge(int age)
	{
		if(0 >= age || age >= 100)
		{
			this.age = 5;
		}
		else
		{
			this.age = age;
		}
	}
	public int getAge()
	{
		return this.age;
	}
	public void setJobTitle(String jobTitle)
	{
		this.jobTitle = jobTitle;
	}
	public String getJobTitle()
	{
		return this.jobTitle;
	}
	public String toString()
	{
		return "\nName: " + this.name + ", Age: " + this.age + ", Job Title: " + this.jobTitle;
	}
	public static void searchName(String name, ArrayList<Person> people)
	{
		boolean hasFound = false;
		
		for(Person person : people)
		{
			String personName = person.getName();
			
			if(personName.equals(name))
			{
				hasFound = true;
				break;
			}
		}
		
		if(hasFound)
		{
			System.out.println("\n" + name + " is in the Array.");
		}
		else
		{
			System.out.println("\nCouldn't find " + name + " in the Array.");
		}
	}
}
