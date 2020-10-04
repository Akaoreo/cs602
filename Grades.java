package hw1;

public class Grades {
	public static void main(String[] args) {
		Student stud1 = new Student("Chenhao");
		Student stud2 = new Student("Li");
		stud1.inputGrade();
		System.out.println("The average of "+ stud1.getName()+ "is"+ stud1.averageScore());
		System.out.println(stud1);
		stud2.inputGrade();
		System.out.println("The average of "+ stud2.getName()+ "is"+ stud2.averageScore());
		System.out.println(stud2);
	}
}
