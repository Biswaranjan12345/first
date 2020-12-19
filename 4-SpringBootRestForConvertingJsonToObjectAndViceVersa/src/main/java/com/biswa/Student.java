package com.biswa;


public class Student {

	private Integer studentId;
	private String studentName;
	private String studentSkill;
	
	
	public Integer getStudentId() {
		return studentId;
	}


	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}


	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	public String getStudentSkill() {
		return studentSkill;
	}


	public void setStudentSkill(String studentSkill) {
		this.studentSkill = studentSkill;
	}


	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentSkill=" + studentSkill
				+ "]";
	}
	
	
	
}
