package com.springrest.reository;

import org.springframework.data.repository.CrudRepository;

import com.springrest.studyeasy.Post;

public interface PostRepository extends CrudRepository<Post,Integer> {

}
