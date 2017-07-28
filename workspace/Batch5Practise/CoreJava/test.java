package CoreJava;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class test {

	public static void main(String[] args) throws FileNotFoundException {
//		ArrayList<String> inty=new ArrayList<>();
//		inty.add("sharifa");
//		inty.add("inty");
//		for (int i = 0; i < 10;i++) {
//			inty.add((i+"a"));
//			System.out.println(inty.get(i));
//		}
//		
//		System.out.println(inty.size());
//	
//		System.out.println(inty);
//		
		
		
//	
//	List<String> a=new ArrayList<>();
//	a.add("a");
//	a.add("b");
//	System.out.println(a.iterator().hasNext());
//
		List<String> list=new ArrayList<>();
		list.add("b");
		list.add("b");
		list.add("a");
		
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		
		HashSet<String> set=new HashSet<>();
		set.add("c");
		set.add("b");
		set.add("a");
		set.add("c");
		set.add("3");
		set.add("2");
		set.add("1");
		set.add("3");
		System.out.println(set);
		
		File file=new File("C:\\Users\\inty\\Desktop\\myfile.txt");
		System.out.println(file.getName());
		Scanner scan=new Scanner(file);
		System.out.println(scan.next());
		scan.close();
		
	}

}
