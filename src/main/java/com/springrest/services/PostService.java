package com.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springrest.reository.PostRepository;
import com.springrest.studyeasy.Post;

@Service
public class PostService {
	
	@Autowired
	private PostRepository repo;
	
	
	/*
	 * List<Post> post = new ArrayList<Post>();
	 * 
	 * public PostService() { post.add(new Post(1, "Dinesh", "Chennai"));
	 * post.add(new Post(2, "Joseph", "Kerala")); post.add(new Post(3, "Kuruvila",
	 * "Mumbai")); post.add(new Post(4, "Mark","America")); post.add(new Post(5,
	 * "Chrish", "Canada")); }
	 */
	public List<Post> get_post(){
//		List<Post> list = new ArrayList<Post>();
//		for(Post post : repo.findAll()) {
//			list.add(post);
//		}
		return (List<Post>) repo.findAll();
	}
	/*
	 * public Post get_posts(int id) { for(Post p : post) { if(p.getId()==id) {
	 * System.out.println(p); return p; } } return null; } // public void
	 * add_post(Post list) { // post.add(list); // } public void update_post(Post
	 * post1, int id) { for(int i=0;i<post.size();i++) { Post temppost =
	 * post.get(i); if(temppost.getId()==id) { post.set(i, post1); } } } public void
	 * delete_post(Post post1, int id) { for(int i=0;i<post.size();i++) { Post
	 * temppost = post.get(i); if(temppost.getId()==id) { post.remove(i); } } }
	 */
}