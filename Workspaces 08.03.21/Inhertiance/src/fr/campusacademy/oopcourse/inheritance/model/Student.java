package fr.campusacademy.oopcourse.inheritance.model;

public class Student extends Person {

	protected String studentid;
	protected double gradePointAverage;

	public Student(String name, int age, String gender, String studentid, double gradePointAverage) {

		super(name, age, gender);
		this.studentid = studentid;
		this.gradePointAverage = gradePointAverage;
	}

	public String getStudentid() {

		return studentid;
	}

	public void setStudentid(String studentid) {

		this.studentid = studentid;
	}

	public double getGradePointAverage() {

		return gradePointAverage;
	}

	public void setGradePointAverage(double gradePointAverage) {

		this.gradePointAverage = gradePointAverage;
	}

	@Override
	public String toString() {

		return super.toString() + ", studentid: " + studentid + ", Grade Point Average: " + gradePointAverage;
	}

}