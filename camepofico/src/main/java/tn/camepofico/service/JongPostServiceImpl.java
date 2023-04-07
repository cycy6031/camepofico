package tn.camepofico.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.camepofico.domain.Post;
import tn.camepofico.mapper.JhPostMapper;
import tn.camepofico.mapper.JongPostMapper;
import tn.camepofico.mapper.PostMapper;

import java.util.List;

@Service
public class JongPostServiceImpl implements  JongPostService{
    @Autowired
    private JongPostMapper jongpostMapper;
    @Override
    public List<Post> list(){
        List<Post> list = jongpostMapper.list();
        return list;
    }
}
