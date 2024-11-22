package com.redesProfesionales.backend.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.bson.types.ObjectId;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public class ProfessionalData {
	
	private String enterprise;
	private String timeWorked;
	private String role;
	private boolean actualWork;
	
	public ProfessionalData(String enterprise, String timeWorked, String role, boolean actualWork) {
		this.enterprise = enterprise;
		this.timeWorked = timeWorked;
		this.role = role;
		this.actualWork = actualWork;
	}

	public String getEnterprise() {
		return enterprise;
	}

	public void setEnterprise(String enterprise) {
		this.enterprise = enterprise;
	}

	public String getTimeWorked() {
		return timeWorked;
	}

	public void setTimeWorked(String timeWorked) {
		this.timeWorked = timeWorked;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public boolean isActualWork() {
		return actualWork;
	}

	public void setActualWork(boolean actualWork) {
		this.actualWork = actualWork;
	}

	@Override
	public String toString() {
		return "ProfessionalData [enterprise=" + enterprise + ", timeWorked=" + timeWorked + ", role="
				+ role + ", actualWork=" + actualWork + "]";
	}
}
