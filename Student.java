package hw1;
import java.util.*;

public class Student {
	Scanner sc = new Scanner(System.in);
	String name;
	double test1;
	double test2;
	
	public Student(String studentName) {
		this.name = studentName;
	}
	public void inputGrade() {
		System.out.println("please enter test1's score for " + name);
			test1 = sc.nextInt();
			System.out.println("please enter test2's score for " + name);
			test2 = sc.nextInt();			
	}
	public double averageScore() {
		return (test1+test2)/2;
	}
	public String getName() {
		return name;
	}
	public String toString() {
		return "name: " + name + " test1: "+ test1+ " test2: "+test2;
	}
}




