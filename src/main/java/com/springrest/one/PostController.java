package com.springrest.one;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.services.PostService;
import com.springrest.studyeasy.Post;

@RestController
public class PostController {
	
	@Autowired
	private PostService service;

	@RequestMapping("/posts")
	public List<Post> getPost(){
		return service.get_post();
	}
	/*
	 * @RequestMapping("/posts/{id}") public Post getPosts(@PathVariable int id) {
	 * return new PostService().get_posts(id); } // @RequestMapping("/posts") //
	 * public void addpost(@PathVariable Post list) { // new
	 * PostService().add_post(list); // }
	 * 
	 * @RequestMapping(method = RequestMethod.PUT,value = "/posts/{id}") public void
	 * updatepost(Post post ,@PathVariable int id) { new
	 * PostService().update_post(post,id); }
	 * 
	 * @RequestMapping(method = RequestMethod.DELETE,value = "/posts/{id}") public
	 * void deletepost(Post post ,@PathVariable int id) { new
	 * PostService().update_post(post,id); }
	 */
}