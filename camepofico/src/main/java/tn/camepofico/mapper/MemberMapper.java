package tn.camepofico.mapper;

import org.apache.ibatis.annotations.Mapper;
import tn.camepofico.domain.Member;

import java.util.List;

@Mapper
public interface MemberMapper {
    void insert(Member member);
    List<Member> list();
    void update(Member member);
    Member findBySeq(Long mb_seq);
    void delete(Long mb_seq);
}
