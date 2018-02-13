package Level_2_Intermediate_WorkingWithFiles;

import java.util.ArrayList;

public class PeopleArray 
{
	private ArrayList<Person> people;
	
	public static void main(String[] args) 
	{
		PeopleArray peoples = new PeopleArray(); 
		
		Person nathan = new Person("Nathan", "Government Official", 23);
		Person daniel = new Person("Daniel", "Prison Inmate", 23);
		Person jason = new Person("Jason", "Janitor", 29);
		
		peoples.addPeople(nathan);
		peoples.addPeople(daniel);
		peoples.addPeople(jason);
		
		
	}
	public PeopleArray()
	{
		people = new ArrayList<Person>();
	}
	public void addPeople(Person people)
	{
		this.people.add(people);
	}
	public void printPeoples()
	{
		
	}
}
