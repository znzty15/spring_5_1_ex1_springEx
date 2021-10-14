package com.javaGG.ex;

public class Student {
	
	private String name;
	private String age;
	private String gradeNum;
	private String calssNum;
	
	public Student(String name, String age, String gradeNum, String calssNum) {		
		this.name = name;
		this.age = age;
		this.gradeNum = gradeNum;
		this.calssNum = calssNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getGradeNum() {
		return gradeNum;
	}

	public void setGradeNum(String gradeNum) {
		this.gradeNum = gradeNum;
	}

	public String getCalssNum() {
		return calssNum;
	}

	public void setCalssNum(String calssNum) {
		this.calssNum = calssNum;
	}	

}
