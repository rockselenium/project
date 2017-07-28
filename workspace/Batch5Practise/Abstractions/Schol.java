package Abstractions;

public class Schol {
	public static void main(String[] args) {
		Student student = new Student();
		OncampusStudent localStudent = new OncampusStudent();
		OnlineStudent onlineStudent = new OnlineStudent();

		localStudent.setName("inty");
		
		System.out.println(localStudent.toString());
	}

	
}
