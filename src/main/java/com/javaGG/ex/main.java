package com.javaGG.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class main {

	public static void main(String[] args) {
		String congifLocation = "classpath:applicationCTX.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(congifLocation);
		StudentInfo StdInfo = ctx.getBean("studentInfo", StudentInfo.class);
		
		StdInfo.getStudentInfo();
		
		Student student2 = ctx.getBean("student2", Student.class);
		StdInfo.setStudent(student2);
		System.out.println();
		StdInfo.getStudentInfo();
		ctx.close();
	}

}
