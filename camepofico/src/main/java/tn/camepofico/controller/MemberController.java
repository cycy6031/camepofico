package tn.camepofico.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import tn.camepofico.domain.Member;
import tn.camepofico.service.MemberService;

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
    public String list(Model model){
        List<Member> list = memberService.list();
        model.addAttribute("list",list);
        return "list";
    }

    @PostMapping("update")
    public String updateOk(Long mb_seq, Member member){
        member.setMb_seq(mb_seq);
        memberService.update(member);
        return "redirect:list";
    }

    @GetMapping("update")
    public String update(Long mb_seq, Model model){
        System.out.println("``````````````````````" + mb_seq);
        Member member = memberService.findBySeq(mb_seq);
        model.addAttribute("member", member);
        return "join";
    }

    @GetMapping("delete")
    public String delete(Long mb_seq){
        System.out.println("seq: " + mb_seq);
        memberService.delete(mb_seq);
        return "redirect:list";
    }
}
