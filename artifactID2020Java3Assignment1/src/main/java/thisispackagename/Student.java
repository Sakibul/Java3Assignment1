package thisispackagename;

public class Student {
	private int studentId;
	private String fullName;
	
	public Student(int stdid, String stdName) {
		this.studentId = stdid;
		this.fullName = stdName;
	}
	
	public String toString() {
		return "Student ID = " + this.studentId + ", Full Name = " + fullName;
	}
}