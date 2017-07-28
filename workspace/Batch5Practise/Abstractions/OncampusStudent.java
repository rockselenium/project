package Abstractions;

public class OncampusStudent extends Student {
	private String city;

	@Override
	public void attendClass() {
		System.out.println("attedning tnhe class in person");

	}
	public String toString() {
		return "student name " + getName();
	}
	public void attendClass(boolean attending) {
		if (attending ) {
			System.out.println("atteding the class through webinarr");
		} else {
			//System.out.println("attedning class in person");
			attendClass();
		}
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
}
