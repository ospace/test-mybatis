package com.tistory.ospace.test.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tistory.ospace.test.annotation.TimeLog;
import com.tistory.ospace.test.entity.Post;
import com.tistory.ospace.test.repository.PostRepository;

@RestController
@RequestMapping("/api")
public class TestRestController {
	private static Logger logger = LoggerFactory.getLogger(TestRestController.class);
	
	@Autowired
	private PostRepository postRepo;
	
	@TimeLog
	@GetMapping("/posts/{id}")
	public Post getOne(@PathVariable("id")String id) {
		return postRepo.findById(id);
	}

	@TimeLog
	@GetMapping("/posts")
	public List<Post> getAll() {
		return postRepo.findAll();
	}
	
	@TimeLog
	@PostMapping(value="/posts", consumes={ MediaType.APPLICATION_JSON_VALUE })
	public void create(@RequestBody Post post) {
		logger.info("post[{}]", post);
		postRepo.create(post);
	}
	
	@TimeLog
	@PutMapping(value="/posts", consumes={ MediaType.APPLICATION_JSON_VALUE })
	public void update(@RequestBody Post post) {
		logger.info("post[{}]", post);
		postRepo.update(post);
	}
	
	@TimeLog
	@DeleteMapping("/posts/{id}")
	public void delete(@PathVariable("id")String id) {
		postRepo.delete(id);
	}
}
