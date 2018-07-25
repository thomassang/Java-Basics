package day0605;

public class Employee extends Person{
	double salary;
	
	public String toString(){
		
		String e = super.toString();
		
		return e+ ", "+salary;
	}

}
