package com.redesProfesionales.backend.service;

import java.util.List;

import org.bson.types.ObjectId;

import com.redesProfesionales.backend.model.Post;

public interface IPostService {
	Post createPost(Post post);
	Post updatePost(Post post);
	
	List<Post> listPosts();
	Post getPost(ObjectId id);
	
	void deletePost(ObjectId id);

}
