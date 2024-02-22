package com.javaOOPSPrinciples;

public class Student 
{

	//properties of the Student class

	//1. fields or variables

	//non-static fields/variables
	private int studentId;
	private String studentName;
	private double studentMarks;

	//static fields/variables
	private static long studentCollegeCode;
	private static String studentCollegeName;


	//constructor: default
	public Student()
	{
		studentId = 202;
		studentName = "abc";
		studentMarks = 45.50;
	}
	
	//parameterized constructor
	public Student(int studentId, String studentName, double studentMarks) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentMarks = studentMarks;
	}

	//blocks: static and instance initializer blocks
	static
	{
		studentCollegeCode = 389323;
		studentCollegeName = "St.Marys College";
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public void setStudentMarks(double studentMarks) {
		this.studentMarks = studentMarks;
	}

	public static void setStudentCollegeCode(long studentCollegeCode) {
		Student.studentCollegeCode = studentCollegeCode;
	}

	public static void setStudentCollegeName(String studentCollegeName) {
		Student.studentCollegeName = studentCollegeName;
	}

	public int getStudentId() {
		return studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public double getStudentMarks() {
		return studentMarks;
	}

	public static long getStudentCollegeCode() {
		return studentCollegeCode;
	}

	public static String getStudentCollegeName() {
		return studentCollegeName;
	}

	//methods
	//1. non-static methods: these methods are able to access both the fields/variables
	public String getCompleteStudentDetails() {
		return studentId+" | "+studentName+" | "+studentMarks+" | "+studentCollegeCode+" | "+studentCollegeName;
	}

	//2. static methods: these methods are able to access only static fields/variables
	public static String getStudentDetails() {
		return studentCollegeCode+" | "+studentCollegeName;
	}

}
