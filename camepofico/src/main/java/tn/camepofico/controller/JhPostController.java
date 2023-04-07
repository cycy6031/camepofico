package tn.camepofico.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import tn.camepofico.domain.Pocategory;
import tn.camepofico.domain.Post;
import tn.camepofico.service.JhCategoryService;
import tn.camepofico.service.JhPostService;

import java.util.List;

@Controller
@RequestMapping("jhpost/")
public class JhPostController {
    @Autowired
    private JhPostService postService;
    @Autowired
    private JhCategoryService categoryService;

    @GetMapping("list")
    public String listAll(Model model){
        List<Post> list = postService.listAll();
        List<Pocategory> pcList = categoryService.list();

        model.addAttribute("list", list);
        model.addAttribute("pcList", pcList);
        return "th/jhPostList";
    }
}
