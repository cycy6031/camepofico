package tn.camepofico.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import tn.camepofico.domain.Member;
import tn.camepofico.service.MemberService;
import tn.camepofico.utility.ScriptUtil;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;
@RequestMapping("member/")
@Controller
public class MemberController {
    @Autowired
    private MemberService memberService;

    @GetMapping("join")
    public String join(){
        return "join";
    }
    @PostMapping("join")
    public String write(Member member){
        memberService.insert(member);
        return "main";
    }
    @GetMapping("list")
    public String list(Model model, HttpSession session, HttpServletResponse response) throws IOException {
        Member login_ses= (Member)session.getAttribute("loginMember");
        if(login_ses == null){
            ScriptUtil.alertAndBackPage(response, "로그인 후 입장해주세요");
        }else{
            List<Member> list = memberService.list();
            model.addAttribute("list",list);

        }
        return "list";
    }

    @PostMapping("update") //관리자용 수정
    public String updateOk(Long mb_seq, Member member){
        System.out.println(mb_seq);
        member.setMb_seq(mb_seq);
        System.out.println(member.getMb_email());
        System.out.println(member.getMb_password());
        System.out.println(member.getMb_name());
        memberService.update(member);
        return "redirect:list";
    }
    @GetMapping("update") //관리자용 수정
    public String update(Long mb_seq, Model model){
        System.out.println("``````````````````````" + mb_seq);
        Member member = memberService.findBySeq(mb_seq);
        model.addAttribute("member", member);
        return "join";
    }

    @GetMapping("edit")
    public String update(Model model,HttpSession session){
        Member login_ses= (Member)session.getAttribute("loginMember");
        model.addAttribute("member", login_ses);
        return "edit";
    }
    @GetMapping("delete")
    public String delete(Long mb_seq){
        System.out.println("seq: " + mb_seq);
        memberService.delete(mb_seq);
        return "redirect:list";
    }
}
