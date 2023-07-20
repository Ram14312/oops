package org.studySession;

public class Hello {

	public static void main(String[] args) {
	  Car c1 = new Car("wooden",10,"mahindra","jamuna");
//	  c1.setDoors("wooden");
//	  c1.setSpeed(120);
//	  c1.setDriver( "jamuna");
//	  c1.setEngine("mahindra");
// if we are not setting the values here we are getting the null pointer exception to sort out the issue 
	  //we use constructors as passing the parameters then in the object creation will need to pass values
// otherwise in default constructor we can pass the value	  
	  
	  System.out.println(c1.getSpeed());
	  System.out.println(c1.getDriver());
	  System.out.println(c1.getDoors());
	  System.out.println(c1.getEngine());
	  System.out.println(c1.run());

	}

}
