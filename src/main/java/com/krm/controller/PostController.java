package com.krm.controller;

import com.krm.entity.Post;
import com.krm.repository.CommentRepository;
import com.krm.repository.PostRepository;

import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/api/v1/posts")
public class PostController {
    private PostRepository postRepository;

    public PostController(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @PostMapping
    public String createPost(
            @RequestBody Post post
    ){
        postRepository.save(post);
        //return the values
        return "Post created successfully";

    }
    @DeleteMapping
    public void deletePost() {
        postRepository.deleteById(1L);
    }
}
