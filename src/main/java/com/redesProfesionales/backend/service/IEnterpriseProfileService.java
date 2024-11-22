package com.redesProfesionales.backend.service;

import java.util.List;

import org.bson.types.ObjectId;

import com.redesProfesionales.backend.model.EnterpriseProfile;

public interface IEnterpriseProfileService {
	EnterpriseProfile createProfile(EnterpriseProfile profile);
	EnterpriseProfile updateProfile(EnterpriseProfile profile);
	
	List<EnterpriseProfile> listProfiles();
	EnterpriseProfile getProfile(ObjectId id);
	
	void deleteProfile(ObjectId id);
}
