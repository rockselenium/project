package Abstractions;

public class inheritaranceTest2 extends inheritanceTest1 {
	public static void main(String[] args) {
		inheritaranceTest2 obj=new inheritaranceTest2();
		obj.num=65;
		System.out.println(obj.num);
		
		obj.print();
		
	}
	public void print(){
		System.out.println("sharifa");
	}
}
