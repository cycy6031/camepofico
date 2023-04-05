package tn.camepofico.service;

import tn.camepofico.domain.Member;
import tn.camepofico.domain.Post;

import java.util.List;

public interface LoginService {
	Member findByEmailS(String mb_email);
}
