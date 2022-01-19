package testing;

class Student{
	int studentRollno;
	String section;
	String clas;
	
	/*
	 * void getVal(int s, String s1, String s2) { this.studentRollno = s; this.clas
	 * = s1; this.section = s2; }
	 */
	
	
	
	void markAttendance() {
		System.out.println("Marked");
	}
	
	public Student(int studentRollno, String clas, String section) {
		super();
		this.studentRollno = studentRollno;
		this.clas = clas;
		this.section = section;
	}

	void displayVal() {
		System.out.println("Student Roll Number \t:\t"+studentRollno);
		System.out.println("Student Class \t\t:\t"+clas);
		System.out.println("Student Section \t:\t"+section);
	}
}

public class TestStudentClass {
	public static void main(String[] args) {
		Student stud1 = new Student(201,"I","A");
		Student stud2 = new Student(202, "III", "C");
		/*
		 * s1.studentRollno=101; // Initialization through reference s1.section="B";
		 * s1.clas="VIII"; s1.markAttendance();
		 */
		/*
		 * Student stud2 = new Student(); stud1.getVal(101, "XII", "A");
		 * stud2.getVal(102, "XI", "C");
		 */
		stud1.displayVal();
		System.out.println("**************************");
		stud2.displayVal();
	}
}
