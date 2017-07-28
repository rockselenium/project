package CoreJava;

public class MyDate {

	private int year;
	private int month;
	private int day;

	public MyDate() {
		year = 1;
		month = 1;
		year = 2000;
	}

	public MyDate(int day, int month, int year) {
		if (day < 30 && day > 0) {
			setDay(day);
		} else {
			System.out.println("day shoud between 1-31");
		}

		if (month > 0 && month < 13) {
			setMonth(month);
		} else {
			System.out.println("month should between 1-12");
		}

		if (year < 2018 && year > 0) {
			setYear(year);
		} else {
			System.out.println("year should between 0-2017");
		}
	}

	public String toString() {
		return month + "/" + day + "/" + year;

	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

}
