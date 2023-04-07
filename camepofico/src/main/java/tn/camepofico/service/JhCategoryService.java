package tn.camepofico.service;

import tn.camepofico.domain.Member;
import tn.camepofico.domain.Pocategory;

import java.util.List;

public interface JhCategoryService {
    void insert(Pocategory pocategory);
    List<Pocategory> list();
    Pocategory findBySeq(Long pc_seq);
    void update(Pocategory pocategory);
    void delete(Long pc_seq);
}
