package Level_2_Intermediate_WorkingWithFiles;

public class Person 
{
	String name;
	String occupation;
	int age;
	
	public Person(String name, String occupation, int age)
	{
		this.name = name;
		this.occupation = occupation;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public String toString() 
	{
		return "Name: " + name + ", Occupation: " + occupation + ", Age: " + age + "\n";
	}
}
