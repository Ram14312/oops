package org.studySession;

public class Car {
	private String doors;
	private int speed;
	private String engine;
	private String driver;
	
	public Car() {
	 this.doors = "wooden";
	 this.speed = 0;
	 this.engine = "mahindra";
	 this.driver = "jamuna";
	}
	
	
	public Car(String doors, int speed, String engine, String driver) {
		this.doors = doors;
		this.speed = speed;
		this.engine = engine;
		this.driver = driver;
	}


	public void setDoors(String doors) {
		this.doors = doors;
	}
	public String getDoors() {
		return doors;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	
	public String run() {
		if(doors.equals("wooden") &&  speed>0
				&& driver.equals( "jamuna") && engine.equals("mahindra")) {
			return "running";
		}else {
			
			return "stable";
		}
		
	}
	
	

}
