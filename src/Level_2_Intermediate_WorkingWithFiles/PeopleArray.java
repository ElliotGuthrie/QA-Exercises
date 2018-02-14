package Level_2_Intermediate_WorkingWithFiles;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class PeopleArray 
{
	private static final String filename = "/Users/Elliot/Desktop/filename.txt";
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
		
		peoples.writePeoples();
		peoples.printPeoples();
	}
	public PeopleArray()
	{
		people = new ArrayList<Person>();
	}
	public void addPeople(Person people)
	{
		this.people.add(people);
	}
	public void writePeoples()
	{
		BufferedWriter bw = null;
		FileWriter fw = null;
		try 
		{
			fw = new FileWriter(filename);
			bw = new BufferedWriter(fw);
			for(Person person : people)
			{
				fw.write(person.toString());
			}
			fw.close();

			System.out.println("Done");
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		} 
		finally
		{
			try 
			{
				if (bw != null)
					bw.close();
				if (fw != null)
					fw.close();
			} 
			catch (IOException ex)
			{
				ex.printStackTrace();
			}
		}
	}
	public void printPeoples()
	{
		File peopleFile = new File("/Users/Elliot/Desktop/filename.txt");
		Scanner peopleReader = null;
		try 
		{
			peopleReader = new Scanner(peopleFile);
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		ArrayList<String> peopleList = new ArrayList<String>();
		while (peopleReader.hasNextLine())
		{
		    peopleList.add(peopleReader.nextLine());
		}
		peopleReader.close();
		
		for(String peoplepeople : peopleList)
		{
			System.out.println(peoplepeople);
		}
	}
}
