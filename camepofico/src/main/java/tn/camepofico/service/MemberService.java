package tn.camepofico.service;

import tn.camepofico.domain.Member;

import java.util.List;

public interface MemberService {
    void insert(Member member);
    List<Member> list();
    void update(Member member);
    Member findBySeq(Long mb_seq);
    void delete(Long mb_seq);
}
