package com.redesProfesionales.backend.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.PersistenceCreator;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@Document(collection="Posts")
public class Post {
	@Id
	@JsonSerialize(using = ObjectIdSerializer.class)
	private ObjectId id;
	
	private String text;
	private String filePath;
	
	private boolean active;
	
	public Post(String text, String filePath) {
		this.text = text;
		this.filePath = filePath;
		this.active = true;
	}
	
	// Getters and Setters

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return "Post [id=" + id + ", text=" + text + ", filePath=" + filePath + ", active=" + active + "]";
	}

	
}
