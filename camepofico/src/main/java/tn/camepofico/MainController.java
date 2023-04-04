package tn.camepofico;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	@GetMapping("/")
	public String main(){
		System.out.println("1111111111");
		return "main";
	}
}
