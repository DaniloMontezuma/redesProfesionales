package com.redesProfesionales.backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import org.bson.types.ObjectId;

import com.redesProfesionales.backend.model.UserProfile;
import com.redesProfesionales.backend.repository.IUserProfileRepository;

@Service
@Transactional
public class UserProfileService implements IUserProfileService{
	@Autowired
	private IUserProfileRepository profileRepository;
	
	public UserProfile createProfile(UserProfile profile) {
		profile.setId(null);
		return this.profileRepository.save(profile);
	}
	
	public UserProfile updateProfile(UserProfile profile) {
		this.profileRepository.findById(profile.getId());
		Optional<UserProfile> profileDb = this.profileRepository.findById(profile.getId());
		
		if(profileDb.isPresent()) {
			UserProfile profileToUpdate = profileDb.get();
			profileToUpdate.setName(profile.getName());
			profileToUpdate.setPicturePath(profile.getPicturePath());
			profileToUpdate.setBannerPath(profile.getBannerPath());
			profileToUpdate.setPersonalData(profile.getPersonalData());
			profileToUpdate.setProfessionalData(profile.getProfessionalData());
			profileToUpdate.setEducationalData(profile.getEducationalData());
			
			profileRepository.save(profileToUpdate);
			return profileToUpdate;
		}
		return null;
	}
	
	public List<UserProfile> listProfiles() {
		return this.profileRepository.findAll();
	}
	
	public UserProfile getProfile(ObjectId id) {
		Optional<UserProfile> profileDb = this.profileRepository.findById(id);
		
		if(profileDb.isPresent()) {
			return profileDb.get();
		}
		return null;
	}
	
	public void deleteProfile(ObjectId id) {
		Optional<UserProfile> profileDb = this.profileRepository.findById(id);
		
		if(profileDb.isPresent()) {
			UserProfile profileToDelete = profileDb.get();
			profileToDelete.setActive(false);
			
			this.profileRepository.save(profileToDelete);
		}
	}
}
