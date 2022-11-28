package assignment7;

//TODO: Copy a working Student class from Assignment 7 over this file.
public class Student {
	
	private String firstName;
	private String lastName;
	private int id;
	private int attemptedCredits;
	private int passingCredits;
	private double qualityPoints;
	private double bearBucks;
	
	public Student(String firstName, String lastName, int id) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
		
		//throw new RuntimeException("TODO: Copy a working Student class from Assignment 7 over this file.");
	}

	public String getFullName() {
	//	throw new RuntimeException("TODO: Copy a working Student class from Assignment 7 over this file.");
		return firstName + " " + lastName;
	}

	public int getId() {
		//throw new RuntimeException("TODO: Copy a working Student class from Assignment 7 over this file.");
		return id;
	}

	public void depositBearBucks(double amount) {
		//throw new RuntimeException("TODO: Copy a working Student class from Assignment 7 over this file.");
		bearBucks += amount;
	}

	public double getBearBucksBalance() {
		//throw new RuntimeException("TODO: Copy a working Student class from Assignment 7 over this file.");
		return bearBucks;
	}
}
