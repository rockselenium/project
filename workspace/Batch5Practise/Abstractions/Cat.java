package Abstractions;

public class Cat extends Animal{
	public static void main(String[] args) {
		Cat cat=new Cat();
		cat.name="Sally";
		cat.color="black";
		System.out.println(cat.name);
		System.out.println(cat.color);
		System.out.println(cat.age);
		cat.makeNoise();
		cat.eat();
	}
	public void makeNoise (){
		System.out.println("cat making nosise");
	}
	default void eat(){
		System.out.println("cat eat");
	}
	
}
