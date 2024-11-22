package com.redesProfesionales.backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import org.bson.types.ObjectId;

import com.redesProfesionales.backend.model.Post;
import com.redesProfesionales.backend.repository.IPostRepository;

@Service
@Transactional
public class PostService implements IPostService{
	
	@Autowired
	private IPostRepository postRepository;
	
	public Post createPost(Post post) {
		post.setId(null);
		return postRepository.save(post);
	}
	
	public Post updatePost(Post post) {
		this.postRepository.findById(post.getId());
		Optional<Post> postDb = this.postRepository.findById(post.getId());
		
		if(postDb.isPresent()) {
			Post postToUpdate = postDb.get();
			postToUpdate.setText(post.getText());
			postToUpdate.setFilePath(post.getFilePath());
			
			postRepository.save(postToUpdate);
			return postToUpdate;
		}
		return null;
	}
	
	public List<Post> listPosts() {
		return this.postRepository.findAll();
	}
	
	public Post getPost(ObjectId id) {
		Optional<Post> postDb = this.postRepository.findById(id);
		
		if(postDb.isPresent()) {
			return postDb.get();
		}
		return null;
	}
	
	public void deletePost(ObjectId id) {
		Optional<Post> postDb = this.postRepository.findById(id);
		
		if(postDb.isPresent()) {
			Post postToDelete = postDb.get();
			postToDelete.setActive(false);
			
			this.postRepository.save(postToDelete);
		}
	}
}
