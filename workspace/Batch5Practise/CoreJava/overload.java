package CoreJava;

public class overload {
	public void method(){
		System.out.println("hello");
	}
	public void method(int a,int b){
		System.out.println(b+a);
	}
	public void method(String a,int b){
		System.out.println("hello"+a+b);
	}
}
