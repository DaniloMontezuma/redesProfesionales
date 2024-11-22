package com.redesProfesionales.backend.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.redesProfesionales.backend.model.EnterpriseProfile;

import java.util.List;

import org.bson.types.ObjectId;

public interface IEnterpriseProfileRepository extends MongoRepository<EnterpriseProfile, ObjectId>{

}
