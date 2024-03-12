package com.myblogapp12.service;

import com.myblogapp12.payload.PostDto;

public interface PostService {
    PostDto createPost(PostDto postDto);

    PostDto getPostById(long id);
}
