package com.javaGG.ex;

public class StudentInfo {
	
	Student student;
	
	public StudentInfo(Student student) {		
		this.student = student;		
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	public void getStudentInfo() {
		System.out.println("�̸� : " + student.getName());
		System.out.println("���� : " + student.getAge());
		System.out.println("�г� : " + student.getGradeNum());
		System.out.println("�� : " + student.getCalssNum());
	}
	
}
