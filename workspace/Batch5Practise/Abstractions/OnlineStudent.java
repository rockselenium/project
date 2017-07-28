package Abstractions;

public class OnlineStudent extends Student {
	private String city;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void attendClass() {
		System.out.println("Atteding the class through webinar");
	}
}
