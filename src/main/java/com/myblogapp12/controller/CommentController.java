package com.myblogapp12.controller;

import com.myblogapp12.payload.CommentDto;
import com.myblogapp12.service.CommentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/comments")
public class CommentController {
    private CommentService commentService;

    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }


    @PostMapping
    public ResponseEntity <CommentDto> createComment(
            @RequestBody CommentDto commentDto,
            @RequestParam long postId ) {

        CommentDto dto = commentService.createComment(commentDto,postId);
        return new ResponseEntity<>(dto, HttpStatus.CREATED);
    }
    //http://localhost:8080/api/comments/3
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteComment(@PathVariable long id){
        commentService.deleteComment(id);
        return new ResponseEntity<>("Comments is being deleted",HttpStatus.OK);
    }
    //http://localhost:8080/api/comments/1
    @PutMapping("/{id}")
    public ResponseEntity<CommentDto> updateComment(
            @PathVariable long id,@RequestBody CommentDto commentDto){
        CommentDto dto = commentService.updateComment(id,commentDto);
        return new ResponseEntity<>(dto,HttpStatus.OK);
    }
}
