package technicalBlog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import technicalBlog.model.Post;
import technicalBlog.repository.PostRepository;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PostServiceTwo {
    @Autowired
    private PostRepository repository;
        public List<Post> getAllPosts()
        {
            return repository.getAllPosts();
        }
        public Post getOnePost()
        {
           return repository.getLatestPost();
        }
    }
