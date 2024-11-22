package com.redesProfesionales.backend.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.bson.types.ObjectId;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.List;

@Document(collection="UserProfiles")
public class UserProfile {
	@Id
	@JsonSerialize(using = ObjectIdSerializer.class)
	private ObjectId id;
	
	private String name;
	private String picturePath;
	private String bannerPath;
	private PersonalData personalData;
	
	private List<ProfessionalData> professionalData;
	private List<EducationalData> educationalData;
	
	private boolean active;
	
	public UserProfile(String name, String picturePath, String bannerPath, PersonalData personalData,
			List<ProfessionalData> professionalData, List<EducationalData> educationalData) {
		super();
		this.name = name;
		this.picturePath = picturePath;
		this.bannerPath = bannerPath;
		this.personalData = personalData;
		this.professionalData = professionalData;
		this.educationalData = educationalData;
		this.active = true;
	}
	public UserProfile(String name, PersonalData personalData,
			List<ProfessionalData> professionalData, List<EducationalData> educationalData) {
		super();
		this.name = name;
		this.picturePath = "";
		this.bannerPath = "";
		this.personalData = personalData;
		this.professionalData = professionalData;
		this.educationalData = educationalData;
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
	public String getPicturePath() {
		return picturePath;
	}
	public void setPicturePath(String picturePath) {
		this.picturePath = picturePath;
	}
	public String getBannerPath() {
		return bannerPath;
	}
	public void setBannerPath(String bannerPath) {
		this.bannerPath = bannerPath;
	}
	public PersonalData getPersonalData() {
		return personalData;
	}
	public void setPersonalData(PersonalData personalData) {
		this.personalData = personalData;
	}
	public List<ProfessionalData> getProfessionalData() {
		return professionalData;
	}
	public void setProfessionalData(List<ProfessionalData> professionalData) {
		this.professionalData = professionalData;
	}
	public List<EducationalData> getEducationalData() {
		return educationalData;
	}
	public void setEducationalData(List<EducationalData> educationalData) {
		this.educationalData = educationalData;
	}
	
	public boolean getActive() {
		return active;
	}
	
	public void setActive(boolean active) {
		this.active = active;
	}
	
	@Override
	public String toString() {
		return "UserProfile [id=" + id + ", name=" + name + ", picturePath=" + picturePath + ", bannerPath="
				+ bannerPath + ", personalData=" + personalData + ", professionalData=" + professionalData
				+ ", educationalData=" + educationalData + "]";
	}
}
