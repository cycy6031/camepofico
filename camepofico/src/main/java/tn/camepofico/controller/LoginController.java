package tn.camepofico.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import tn.camepofico.domain.Member;
import tn.camepofico.domain.Post;
import tn.camepofico.service.LoginService;
import tn.camepofico.service.PostService;
import tn.camepofico.utility.ScriptUtil;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@Controller
public class LoginController {
	@Autowired
	LoginService loginService;
	@GetMapping("login")
	public String login() {
	    return "login";
	}
	@PostMapping("login")
	public void login_Ok(Member member, HttpServletResponse response, HttpSession session) throws IOException {
		String checkEmail = member.getMb_email();
		String checkPwd = member.getMb_email();
		if(checkEmail == null){
			ScriptUtil.alertAndBackPage(response, "이메일이 존재하지 않습니다.");
		}else if(checkPwd == null){
			ScriptUtil.alertAndBackPage(response, "비밀번호 입력에 문제가 발생하였습니다.");
		}else{
			Member loginMember = loginService.findByEmailS(member.getMb_email());
			String memberPwd = loginMember.getMb_password();
			if(!checkPwd.equals(memberPwd)) {
				ScriptUtil.alertAndBackPage(response, "비밀번호가 틀렷습니다");
			}else {
				session.setAttribute("loginMember",loginMember);
				ScriptUtil.alertAndMovePage(response, "로그인 완료", "/");
			}
		}
	}
	@GetMapping("logout")
	public String logout(HttpSession session){
		session.invalidate();
		return "redirect:/";
	}
}

