package com.geekster.InstagramBasic.repository;

import com.geekster.InstagramBasic.model.Post;
import com.geekster.InstagramBasic.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPostRepo extends JpaRepository<Post,Integer> {
    Post findByUser(User user);
}
