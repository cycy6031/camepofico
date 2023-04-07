package tn.camepofico.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.camepofico.domain.Post;
import tn.camepofico.mapper.JhPostMapper;

import java.util.List;

@Service
public class JhPostServiceImpl implements  JhPostService{
    @Autowired
    private JhPostMapper postMapper;
    @Override
    public List<Post> listAll(){ return null;}
}
