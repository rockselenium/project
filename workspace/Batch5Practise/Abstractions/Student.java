package Abstractions;

public abstract class Student {
	private String name;
	private int studentId;

	public Student(String name, String student) {
		this.name = name;
		setStudentId(studentId);
	}

	public void attendClass() {
		System.out.println("attend class");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
}
