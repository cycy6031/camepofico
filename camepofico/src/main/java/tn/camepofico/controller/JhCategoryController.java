package tn.camepofico.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import tn.camepofico.domain.Pocategory;
import tn.camepofico.service.JhCategoryService;

import java.util.List;

@Controller
@RequestMapping("jhcategory/")
public class JhCategoryController {
    @Autowired
    private JhCategoryService categoryService;

    @GetMapping("list")
    public String list(Model model){
        List<Pocategory> list = categoryService.list();
        model.addAttribute("list", list);
        return "th/jhCatList";
    }

    @GetMapping("add")
    public String addCat(){
        return "JhCatAdd";
    }
    @PostMapping("add")
    public String addCatOk(Pocategory pocategory){
        categoryService.insert(pocategory);
        return "redirect:/jhcategory/list";
    }

    @GetMapping("update")
    public String update(Long pc_seq, Model model){
        Pocategory pocategory = categoryService.findBySeq(pc_seq);
        model.addAttribute("category", pocategory);
        return "th/JhCatAdd";
    }

    @PostMapping("update")
    public String updateOk(Long pc_seq, Pocategory pocategory){
        pocategory.setPc_seq(pc_seq);
        categoryService.update(pocategory);
        return "redirect:/jhcategory/list";
    }

    @GetMapping("delete")
    public String delete(Long pc_seq){
        categoryService.delete(pc_seq);
        return "redirect:/jhcategory/list";
    }
}
