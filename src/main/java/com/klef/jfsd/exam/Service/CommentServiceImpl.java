package com.klef.jfsd.exam.Service;

import com.klef.jfsd.exam.model.Comment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {

	@Autowired
	private RestTemplate restTemplate;


    @Override
    public List<Comment> getAllComments() {
        String url = "https://jsonplaceholder.typicode.com/comments";
        Comment[] commentsArray = restTemplate.getForObject(url, Comment[].class);
        return Arrays.asList(commentsArray);
    }
}