package com.edubridge.elite.model;

public class Student {
	private int studentId;
	private String studentName;
	private int studentMobile;
	private String studentEmail;
	
	public Student() {
		super();
	}
	public Student(int studentId, String studentName,int studentMobile,String studentEmail) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentMobile = studentMobile;
		this.studentEmail = studentEmail;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentMobile=" + studentMobile
				+ ", studentEmail=" + studentEmail + "]";
	}
	

}
