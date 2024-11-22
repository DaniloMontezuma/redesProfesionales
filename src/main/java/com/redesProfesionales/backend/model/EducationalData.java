package com.redesProfesionales.backend.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.bson.types.ObjectId;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public class EducationalData {
	
	private String certification;
	private String year;
	private String filePath;
	
	public EducationalData(String certification, String year, String filePath) {
		super();
		this.certification = certification;
		this.year = year;
		this.filePath = filePath;
	}

	public String getCertification() {
		return certification;
	}

	public void setCertification(String certification) {
		this.certification = certification;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	@Override
	public String toString() {
		return "EducationalData [certification=" + certification + ", year=" + year + ", filePath="
				+ filePath + "]";
	}
	
	
}
