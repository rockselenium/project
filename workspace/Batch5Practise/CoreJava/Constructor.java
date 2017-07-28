package CoreJava;

public class Constructor {
	private int i;
	
	public Constructor(){
		i=100;
		System.out.println("new C created");
	}
	public Constructor(int i){
		this();
		this.i=i;
		System.out.println(i);
	}
}
	




