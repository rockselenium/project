package Abstractions;

public class Animal {

	String name;
	int age;
	String color;
	String ownName;

	public void makeNoise() {
		System.out.println("animal making noise");
	}
	protected void eat(){
		System.out.println("animal eating");
	}
}
