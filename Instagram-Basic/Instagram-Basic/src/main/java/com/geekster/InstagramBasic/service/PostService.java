package com.geekster.InstagramBasic.service;

import com.geekster.InstagramBasic.model.Post;
import com.geekster.InstagramBasic.model.User;
import com.geekster.InstagramBasic.repository.IPostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {

    @Autowired
    IPostRepo postRepo;

    public void addPost(Post post) {
        postRepo.save(post);
    }

    public Post getPost(User user) {
        return postRepo.findByUser(user);
    }
}
