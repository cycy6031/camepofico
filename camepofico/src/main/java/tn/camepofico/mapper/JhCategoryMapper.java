package tn.camepofico.mapper;

import org.apache.ibatis.annotations.Mapper;
import tn.camepofico.domain.Member;
import tn.camepofico.domain.Pocategory;

import java.util.List;

@Mapper
public interface JhCategoryMapper {
    void insert(Pocategory pocategory);
    List<Pocategory> list();
    Pocategory findBySeq(Long pc_seq);
    void update(Pocategory pocategory);
    void delete(Long pc_seq);
}
