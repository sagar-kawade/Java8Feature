

package com.Feature8.in;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Student{
	int id;
	String name;
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
}
class  Course{
	String courseName;
	int c_id;
	public Course(String courseName, int c_id) {
		super();
		this.courseName = courseName;
		this.c_id = c_id;
	}
	
	
}
public class ForEachMethod {
	
	public static void main(String[] args) {
Map<Student, Course> mp1=new HashMap<>();
mp1.put(new Student(10, "John"), new Course("java", 1010));
mp1.put(new Student(12, "mohn"), new Course("c", 2021));
mp1.put(new Student(13, "Lohn"), new Course("cpp", 10320));
mp1.put(new Student(16, "Dohn"), new Course("cad", 12210));
mp1.put(new Student(17, "Rohn"), new Course("cam", 1210));

mp1.forEach((k,v)->System.out.println("Student Id & Name: "+k.id+" "+k.name+" \tCourse Id & Name  "+v.courseName+" "+v.c_id));

	}

}
