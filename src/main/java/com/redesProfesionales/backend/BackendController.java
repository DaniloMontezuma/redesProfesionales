package com.redesProfesionales.backend;

import org.springframework.web.bind.annotation.*;

import com.redesProfesionales.backend.model.Post;
import com.redesProfesionales.backend.service.IPostService;
import com.redesProfesionales.backend.model.UserProfile;
import com.redesProfesionales.backend.service.IUserProfileService;
import com.redesProfesionales.backend.model.EnterpriseProfile;
import com.redesProfesionales.backend.service.IEnterpriseProfileService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

import org.bson.types.ObjectId;

@RestController
@RequestMapping("/api")
public class BackendController {
	// Services
	
	@Autowired
	private IPostService postService;
	
	@Autowired
	private IUserProfileService profileService;
	
	@Autowired
	private IEnterpriseProfileService enterpriseService;
	
	// Post methods
	
	@PostMapping("/post/list")
	public ResponseEntity<Post> createPost(@RequestBody Post post) {
		Post myPost = post;
		return ResponseEntity.ok().body(this.postService.createPost(myPost));
	}
	
	@PostMapping("/profile/list")
	public ResponseEntity<UserProfile> createProfile(@RequestBody UserProfile profile) {
		UserProfile myProfile = profile;
		return ResponseEntity.ok().body(this.profileService.createProfile(myProfile));
	}
	
	@PostMapping("/enterprise/list")
	public ResponseEntity<EnterpriseProfile> createEnterprise(@RequestBody EnterpriseProfile profile) {
		EnterpriseProfile myProfile = profile;
		return ResponseEntity.ok().body(this.enterpriseService.createProfile(myProfile));
	}
	
	// List Methods
	
	@GetMapping("/post/list")
	public ResponseEntity<List<Post>> listPosts(){
		return ResponseEntity.ok().body(this.postService.listPosts());
	}
	
	@GetMapping("/profile/list")
	public ResponseEntity<List<UserProfile>> listProfiles() {
		return ResponseEntity.ok().body(this.profileService.listProfiles());
	}
	
	@GetMapping("/enterprise/list")
	public ResponseEntity<List<EnterpriseProfile>> listEnterprises(){
		return ResponseEntity.ok().body(this.enterpriseService.listProfiles());
	}
	
	// Detail Methods
	
	@GetMapping("/post/list/{id}")
	public ResponseEntity<Post> getPost(@PathVariable ObjectId id) {
		return ResponseEntity.ok().body(this.postService.getPost(id));
	}
	
	@GetMapping("/profile/list/{id}")
	public ResponseEntity<UserProfile> getProfile(@PathVariable ObjectId id){
		return ResponseEntity.ok().body(this.profileService.getProfile(id));
	}
	
	@GetMapping("/enterprise/list/{id}")
	public ResponseEntity<EnterpriseProfile> getEnterprise(@PathVariable ObjectId id) {
		return ResponseEntity.ok().body(this.enterpriseService.getProfile(id));
	}
	
	// Put Methods
	
	@PutMapping("/post/list/{id}")
	public ResponseEntity<Post> updatePost(@PathVariable ObjectId id, @RequestBody Post post) {
		post.setId(id);
		return ResponseEntity.ok().body(this.postService.updatePost(post));
	}
	
	@PutMapping("/profile/list/{id}")
	public ResponseEntity<UserProfile> updateProfile(@PathVariable ObjectId id, @RequestBody UserProfile profile){
		profile.setId(id);
		return ResponseEntity.ok().body(this.profileService.updateProfile(profile));
	}
	
	@PutMapping("/enterprise/list/{id}")
	public ResponseEntity<EnterpriseProfile> updateEnterprise(@PathVariable ObjectId id, @RequestBody EnterpriseProfile profile) {
		profile.setId(id);
		return ResponseEntity.ok().body(this.enterpriseService.updateProfile(profile));
	}
	
	// Delete Methods
	
	@DeleteMapping("/post/list/{id}")
	public HttpStatus deletePost(@PathVariable ObjectId id) {
		this.postService.deletePost(id);
		return HttpStatus.OK;
	}
	
	@DeleteMapping("/profile/list/{id}")
	public HttpStatus deleteProfile(@PathVariable ObjectId id) {
		this.profileService.deleteProfile(id);
		return HttpStatus.OK;
	}
	
	@DeleteMapping("/enterprise/list/{id}")
	public HttpStatus deleteEnterprise(@PathVariable ObjectId id) {
		this.enterpriseService.deleteProfile(id);
		return HttpStatus.OK;
	}
}
