package com.redesProfesionales.backend.service;

import java.util.List;

import org.bson.types.ObjectId;

import com.redesProfesionales.backend.model.UserProfile;

public interface IUserProfileService {
	UserProfile createProfile(UserProfile profile);
	UserProfile updateProfile(UserProfile profile);
	
	List<UserProfile> listProfiles();
	UserProfile getProfile(ObjectId id);
	
	void deleteProfile(ObjectId id);
}
