package tn.camepofico.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.camepofico.domain.Member;
import tn.camepofico.mapper.MemberMapper;

import java.util.List;

@Service
public class MemberServiceImpl implements MemberService{
    @Autowired
    private MemberMapper memberMapper;
    @Override
    public void insert(Member member) {
        System.out.println(member.getMb_seq());
        memberMapper.insert(member);
        System.out.println(member.getMb_seq());
    }
    @Override
    public List<Member> list(){
        List<Member> list = memberMapper.list();
        return list;
    }
    @Override
    public void update(Member member){
        memberMapper.update(member);
    }
    @Override
    public Member findBySeq(Long mb_seq){
        return memberMapper.findBySeq(mb_seq);
    }
}
