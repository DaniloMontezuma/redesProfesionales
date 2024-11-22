package com.redesProfesionales.backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import org.bson.types.ObjectId;

import com.redesProfesionales.backend.model.EnterpriseProfile;
import com.redesProfesionales.backend.repository.IEnterpriseProfileRepository;

@Service
@Transactional
public class EnterpriseProfileService implements IEnterpriseProfileService{
	@Autowired
	private IEnterpriseProfileRepository profileRepository;
	
	public EnterpriseProfile createProfile(EnterpriseProfile profile) {
		profile.setId(null);
		return this.profileRepository.save(profile);
	}
	
	public EnterpriseProfile updateProfile(EnterpriseProfile profile) {
		this.profileRepository.findById(profile.getId());
		Optional<EnterpriseProfile> profileDb = this.profileRepository.findById(profile.getId());
		
		if (profileDb.isPresent()) {
			EnterpriseProfile profileToUpdate = profileDb.get();
			profileToUpdate.setName(profile.getName());
			profileToUpdate.setBackStory(profile.getBackStory());
			profileToUpdate.setCompanyData(profile.getCompanyData());
			
			this.profileRepository.save(profileToUpdate);
			return profileToUpdate;
		}
		return null;
	}
	
	public List<EnterpriseProfile> listProfiles() {
		return this.profileRepository.findAll();
	}
	
	public EnterpriseProfile getProfile(ObjectId id) {
		Optional<EnterpriseProfile> profileDb = this.profileRepository.findById(id);
		
		if (profileDb.isPresent()) {
			return profileDb.get();
		}
		return null;
	}
	
	public void deleteProfile(ObjectId id) {
		Optional<EnterpriseProfile> profileDb = this.profileRepository.findById(id);
		
		if (profileDb.isPresent()) {
			EnterpriseProfile profileToDelete = profileDb.get();
			profileToDelete.setActive(false);
			
			this.profileRepository.save(profileToDelete);
		}
	}
}
