package tn.camepofico.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import tn.camepofico.domain.Member;
import tn.camepofico.domain.Pocategory;
import tn.camepofico.service.JongService;
import tn.camepofico.service.LoginService;
import tn.camepofico.utility.ScriptUtil;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@RequestMapping("jong/")
@Controller
public class JongController {
	@Autowired
	JongService jongService;

	@GetMapping("cate")
	public String cate(Model model){
		List<Pocategory> list = jongService.list();
		System.out.println(list);
		model.addAttribute("list", list);
		return "jongcatlist";
	}
	@GetMapping("catwrite")
	public String catwrite(){
		return "catwrite";
	}
	@PostMapping("catwrite")
	public void catwrite(Pocategory pocategory, HttpServletResponse response) throws IOException{
		jongService.insertCat(pocategory);
		ScriptUtil.alertAndMovePage(response,"카테가 추가됨!","/jong/cate");
	}
}

