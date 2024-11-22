package com.redesProfesionales.backend.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.redesProfesionales.backend.model.UserProfile;

import java.util.List;

import org.bson.types.ObjectId;

public interface IUserProfileRepository extends MongoRepository<UserProfile, ObjectId>{
	List<UserProfile> findByActive(boolean active);
}
