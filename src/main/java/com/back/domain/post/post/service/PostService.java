package com.back.domain.post.post.service;

import com.back.domain.post.post.repository.PostRepository;
import org.springframework.stereotype.Service;

@Service
public class PostService {
    private PostRepository postRepository;

    public long count() {
        return postRepository.count();
    }
}