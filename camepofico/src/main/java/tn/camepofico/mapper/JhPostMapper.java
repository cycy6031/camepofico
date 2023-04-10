package tn.camepofico.mapper;

import org.apache.ibatis.annotations.Mapper;
import tn.camepofico.domain.Post;

import java.util.List;

@Mapper
public interface JhPostMapper {
    List<Post> listAll();
    List<Post> listcate(String category);
}
