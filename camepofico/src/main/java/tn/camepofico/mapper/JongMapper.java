package tn.camepofico.mapper;

import org.apache.ibatis.annotations.Mapper;
import tn.camepofico.domain.Pocategory;

import java.util.List;

@Mapper
public interface JongMapper {
    List<Pocategory> list();

    void insertCat(Pocategory pocategory);
}
