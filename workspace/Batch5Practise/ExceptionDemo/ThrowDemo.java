package ExceptionDemo;

public class ThrowDemo {
	public static void main(String[] args) throws InterruptedException {
		try{
		System.out.println(10/0);
	}catch(Exception e){
		System.out.println(e.getMessage());
	}
		
	Thread.sleep(1000);
}
	
	
	
}