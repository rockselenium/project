package ExceptionDemo;

import java.io.File;

public class ExceptionDemo {
	static String str;

	public static void main(String[] args) {
		int[] nums = { 12, 98, 35, 60 };
		try {
			System.out.println(nums[0] );
		} catch (NullPointerException e) {
			System.out.println("erro happened");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("erro happened 2");
		} catch (ArithmeticException e) {
			System.out.println("erro happened 3");
		}finally{
			System.out.println(10/0);
	}
		System.out.println("hello");
	}
}
