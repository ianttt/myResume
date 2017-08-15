package com.example.utils;

import java.util.Date;


public class Me {
	private String name;
	private String gender;
	private String education;
	private String school;
	private String major;
	public Me() {
	}
	public Me(String name, String gender, String education, String school, String major) {
		this.name = name;
		this.gender = gender;
		this.education = education;
		this.school = school;
		this.major = major;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	@Override
	public String toString() {
		return "Me [name=" + name + ", gender=" + gender + ", education=" + education + ", school=" + school
				+ ", major=" + major  +"]";
	}
	
}
