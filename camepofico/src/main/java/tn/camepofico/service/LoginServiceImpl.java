package tn.camepofico.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.camepofico.domain.Member;
import tn.camepofico.domain.Post;
import tn.camepofico.mapper.LoginMapper;
import tn.camepofico.mapper.PostMapper;

import java.util.List;

@Service
public class LoginServiceImpl implements LoginService{
	@Autowired
	private LoginMapper loginMapper;
	@Override
	public Member findByEmailS(String mb_email) {

		Member member = loginMapper.findByEmail(mb_email);
		return member;
	}
}
