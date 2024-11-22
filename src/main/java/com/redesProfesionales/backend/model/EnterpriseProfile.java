package com.redesProfesionales.backend.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.bson.types.ObjectId;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@Document(collection="EnterpriseProfiles")
public class EnterpriseProfile {
	@Id
	@JsonSerialize(using = ObjectIdSerializer.class)
	private ObjectId id;
	
	private String name;
	private String backStory;
	private CompanyData companyData;
	
	private boolean active;

	public EnterpriseProfile(String name, String backStory, CompanyData companyData) {
		this.name = name;
		this.backStory = backStory;
		this.companyData = companyData;
		this.active = true;
	}

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBackStory() {
		return backStory;
	}

	public void setBackStory(String backStory) {
		this.backStory = backStory;
	}

	public CompanyData getCompanyData() {
		return companyData;
	}

	public void setCompanyData(CompanyData companyData) {
		this.companyData = companyData;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return "EnterpriseProfile [id=" + id + ", name=" + name + ", backStory=" + backStory + ", companyData="
				+ companyData + ", active=" + active + "]";
	}
}
