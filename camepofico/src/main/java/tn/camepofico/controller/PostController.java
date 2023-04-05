package tn.camepofico.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import tn.camepofico.domain.Member;
import tn.camepofico.domain.Post;
import tn.camepofico.service.PostService;

import java.util.List;

@Controller
@RequestMapping("post")
public class PostController {
	@Autowired
	private PostService postService;

	@GetMapping("listJson.do")
	@ResponseBody
	public List<Post> listJson(){
		return postService.listJsonS();
	}

}

