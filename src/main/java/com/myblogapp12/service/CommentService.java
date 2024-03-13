package com.myblogapp12.service;

import com.myblogapp12.payload.CommentDto;

public interface CommentService {
    CommentDto createComment(CommentDto commentDto,long postId);
}
