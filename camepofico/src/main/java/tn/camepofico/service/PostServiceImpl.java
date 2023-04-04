package tn.camepofico.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.camepofico.domain.Post;
import tn.camepofico.mapper.PostMapper;

import java.util.List;

@Service
public class PostServiceImpl implements PostService{
	@Autowired
	private PostMapper postMapper;
	@Override
	public List<Post> listJsonS() {
		return postMapper.listJson();
	}
}
