package com.krm.controller;

import com.krm.entity.Comment;
import com.krm.entity.Post;
import com.krm.repository.CommentRepository;
import com.krm.repository.PostRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/comments")
public class CommentController {
    private PostRepository postRepository;
    private CommentRepository commentRepository;


    public CommentController(PostRepository postRepository, CommentRepository commentRepository) {
        this.postRepository = postRepository;
        this.commentRepository = commentRepository;
    }

    @PostMapping
    public String createComment(
            @RequestBody Comment comment,
            @RequestParam long postId
    ){
        System.out.println(1000);
        System.out.println(1000);
        System.out.println(1000);
        System.out.println(1000);

        Post post = postRepository.findById(postId).get();
        comment.setPost(post);

        commentRepository.save(comment);
        return "Comment created successfully";
    }


}
