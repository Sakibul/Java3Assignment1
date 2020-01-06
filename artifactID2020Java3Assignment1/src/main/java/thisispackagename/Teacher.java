package thisispackagename;

import java.util.List;
import java.util.ArrayList;

public class Teacher {
	private String fullName;
	private List<Student> arrStudents = new ArrayList<Student>(); // arrStudents
	
	public Teacher(String teacherName) {
		this.fullName = teacherName;
	}
	
	public List<Student> setArrStudents() {
		return arrStudents;
	}
	
	public void setArrStudents(List<Student> listOfStudents) {
		this.arrStudents = listOfStudents;
	}
	
	public void showInformation() {
		
		System.out.println("Teacher's Full Name = " + this.fullName);
		System.out.println();
		System.out.println("Students of this Teacher are:");
		
		// for(Student oneStudent : arrStudents) {
		for (int i = 0; i < arrStudents.size(); i++) {
	      System.out.println(arrStudents.get(i).toString());
	    }
	}
}