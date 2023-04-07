package tn.camepofico.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.camepofico.domain.Pocategory;
import tn.camepofico.mapper.JhCategoryMapper;

import java.util.List;

@Service
public class JhCategoryServiceImpl implements JhCategoryService{
    @Autowired
    private JhCategoryMapper categoryMapper;
    @Override
    public void insert(Pocategory pocategory) {
        categoryMapper.insert(pocategory);
    }
    @Override
    public List<Pocategory> list(){
        List<Pocategory> list = categoryMapper.list();
        return list;
    }
    @Override
    public Pocategory findBySeq(Long pc_seq){
        return categoryMapper.findBySeq(pc_seq);
    }
    @Override
    public void update(Pocategory pocategory){
        categoryMapper.update(pocategory);
    }
    @Override
    public void delete(Long pc_seq){
        categoryMapper.delete(pc_seq);
    }
}
