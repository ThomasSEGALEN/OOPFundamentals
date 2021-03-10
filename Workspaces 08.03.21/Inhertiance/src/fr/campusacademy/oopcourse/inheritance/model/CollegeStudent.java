package fr.campusacademy.oopcourse.inheritance.model;

public class CollegeStudent extends Student {

	protected String major;
	protected int year;

	public CollegeStudent(String name, int age, String gender, String studentid, double gradePointAverage, String major, int year) {

		super(name, age, gender, studentid, gradePointAverage);
		this.major = major;
		this.year = year;
	}

	public String getMajor() {

		return major;
	}

	public void setMajor(String major) {

		this.major = major;
	}

	public int getYear() {

		return year;
	}

	public void setYear(int year) {

		this.year = year;
	}

	@Override
	public String toString() {

		return super.toString() + ", major: " + major + ", year: " + year;
	}

}