package Abstractions;

public class Dog extends Animal {

	public static void m1(int[] ary) {
		for (int i = 0; i < ary.length; i++) {
			if (ary[i] % 2 == 1)
				System.out.println(ary[i]);
		}
	}

	public static void main(String[] args) {
		int[] a = { 14, 9898, 4544, 10, 66, 987, 99 };
		Dog.m1(a);
		
		

	}
}
