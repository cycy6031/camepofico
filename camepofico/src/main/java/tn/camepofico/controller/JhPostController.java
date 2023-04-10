package tn.camepofico.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import tn.camepofico.domain.Pocategory;
import tn.camepofico.domain.Post;
import tn.camepofico.service.JhCategoryService;
import tn.camepofico.service.JhPostService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("jhpost/")
public class JhPostController {
    @Autowired
    private JhPostService postService;
    @Autowired
    private JhCategoryService categoryService;

    @GetMapping("list")
    public String listCate(Model model, HttpServletRequest request){
        String category = request.getParameter("ca");
        List<Post> list;
        List<Pocategory> pcList = categoryService.list();
        if(category == null){
            list = postService.listAll();
        }else{
            list = postService.listcate(category);
        }
        model.addAttribute("list", list);
        model.addAttribute("pcList", pcList);
        return "th/jhPostList";
    }

    @GetMapping("write")
    public String write(){
        return "th/jhPostWrite";
    }
}
