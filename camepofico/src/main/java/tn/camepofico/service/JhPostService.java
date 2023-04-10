package tn.camepofico.service;

import tn.camepofico.domain.Post;

import java.util.List;

public interface JhPostService {
    List<Post> listAll();
    List<Post> listcate(String category);
}
