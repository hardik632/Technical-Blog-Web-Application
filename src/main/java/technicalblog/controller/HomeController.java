package technicalBlog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import technicalBlog.model.Post;
import technicalBlog.service.PostService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private PostService postService;

    @RequestMapping("/")
    public String getAllPost(Model model)
    {
      List<Post> posts=postService.getAllPosts();
        model.addAttribute("posts",posts);
        return "index";

    }
}
