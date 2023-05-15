package com.geekster.InstagramBasic.controller;

import com.geekster.InstagramBasic.model.Post;
import com.geekster.InstagramBasic.model.User;
import com.geekster.InstagramBasic.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/post")
public class PostController {

    @Autowired
    PostService postService;

    @PostMapping(value = "/createPost")
    public void addPost(@RequestBody Post post){
        postService.addPost(post);
    }

    @GetMapping(value = "/getPost")
    public Post getPost(@PathVariable User user){
        return postService.getPost(user);
    }
}
