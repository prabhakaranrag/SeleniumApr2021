package org.college;

public class Student extends Department {
	
	private void studentName() {

		System.out.println("PR");

	}
	private void studentDept() {
		System.out.println("Computer");

	}
	private void studentId() {
		System.out.println("234");

	}

	public static void main(String[] args) {
		
		Student st = new Student();
		st.studentName();
		st.studentDept();
		st.deptName();
		st.collegeName();
		st.collegeCode();
		st.collegeRank();

	}

}
