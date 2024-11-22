package com.redesProfesionales.backend.model;

public class PersonalData {
	
	private int age;
	private int experienceYears;
	private String phone;
	private String freeSpace;
	private boolean active;
	
	public PersonalData(int age, int experienceYears, String phone, String freeSpace) {
		this.age = age;
		this.experienceYears = experienceYears;
		this.phone = phone;
		this.freeSpace = freeSpace;
		this.active = true;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getExperienceYears() {
		return experienceYears;
	}

	public void setExperienceYears(int experienceYears) {
		this.experienceYears = experienceYears;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getFreeSpace() {
		return freeSpace;
	}

	public void setFreeSpace(String freeSpace) {
		this.freeSpace = freeSpace;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return "PersonalData [age=" + age + ", experienceYears=" + experienceYears + ", phone=" + phone
				+ ", freeSpace=" + freeSpace + ", active=" + active + "]";
	}
}
