import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;


class Person {
	
	//instance variable
	
	String name ;
	int age;
	String company;
	int yearBorn;
	
	//constructor
	
	//method
	
	void speak (){
		String [] names = {"Usha", "Monika", "raju"};
		for (int i=0; i<names.length; i++)
		System.out.println("my name is " +names[i]+ "age is" +age);
	}
	
	void helloSay(){
		System.out.println ("hello there!" +name);
	}
	
	//method change to int from void as the return type is int
	
	int calYearofRetirement(){
		int retirementAge = 65 - age;
		//System.out.println ("Retirement age of" +name+ "!" +retirementAge);
		return	retirementAge;
	}
	
	int yourAge(){
		
		int currentYear;
		Calendar cal1 = new GregorianCalendar ();
		cal1.set(Calendar.MONTH, Calendar.MAY );
		currentYear = cal1.get(Calendar.YEAR);
		//System.out.println ("Retirement age of" +name+ "!" +currentYear);
		return currentYear;
				
	}
	
	
}

public class Shweta {
	
	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();
		
		p1.age = 30;
		p1.yearBorn = 1983;
		p1.name = "shweta";
		
		int years= p1. calYearofRetirement();
		System.out.println("years till retirement" + years);
		
		
		//p2.name = "sathya";
		p3.name = "V";
		p2.age = 20;
		//p1.yourAge();
		
		int shwetaAge = p1.yourAge()-p1.yearBorn;
		System.out.println(p1.name +"'s age"  + shwetaAge);
		//calling a method
		//p2.speak();
		
		//calling another method
		//p1.helloSay();
		
		//p1. calYearofRetirement();
		//System.out.println(p1.name);
		//System.out.println(p2.name);
		//System.out.println(p3.name);
	}

	
}
