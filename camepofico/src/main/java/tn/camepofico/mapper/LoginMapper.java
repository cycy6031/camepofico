package tn.camepofico.mapper;

import org.apache.ibatis.annotations.Mapper;
import tn.camepofico.domain.Member;
import tn.camepofico.domain.Post;

import java.util.List;

@Mapper
public interface LoginMapper {
    Member findByEmail(String mb_email);
}
