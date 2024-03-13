package com.myblogapp12.service;

import com.myblogapp12.payload.PostDto;

import java.util.List;

public interface PostService {
    PostDto createPost(PostDto postDto);
    PostDto getPostById(long id);
    List<PostDto> getAllPosts(int pageNo, int pageSize, String sortBy, String sortDir);
}
