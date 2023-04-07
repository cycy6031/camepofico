package tn.camepofico;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import tn.camepofico.domain.Member;

import javax.servlet.http.HttpSession;

@Controller
public class MainController {
	@GetMapping("/")
	public String main(HttpSession session){
		Member login_ses= (Member)session.getAttribute("loginMember");
		return "th/main";
	}
}
