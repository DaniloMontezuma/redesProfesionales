package com.redesProfesionales.backend.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.redesProfesionales.backend.model.Post;

import java.util.List;

import org.bson.types.ObjectId;

public interface IPostRepository extends MongoRepository<Post, ObjectId>{
	List<Post> findByActive(boolean active);
}
