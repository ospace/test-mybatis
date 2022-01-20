package com.tistory.ospace.test.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.tistory.ospace.test.entity.Post;

@Mapper
public interface PostRepository {
	List<Post> findAll();
	
	Post findById(String id);
	
	void create(Post user);
	
	void update(Post user);
	
	void delete(String id);
}
