package tn.camepofico.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.camepofico.domain.Member;
import tn.camepofico.domain.Pocategory;
import tn.camepofico.mapper.JongMapper;
import tn.camepofico.mapper.LoginMapper;

import java.util.List;

@Service
public class JongServiceImpl implements JongService{
	@Autowired
	JongMapper jongMapper;
	@Override
	public List<Pocategory> list() {
			List<Pocategory> list = jongMapper.list();
			return list;
		}

	@Override
	public void insertCat(Pocategory pocategory) {
		jongMapper.insertCat(pocategory);
	}

	@Override
	public Pocategory findBySeq(Long pc_seq) {
		Pocategory pocategory = jongMapper.findBySeq(pc_seq);
		return pocategory;
	}

	@Override
	public void update(Pocategory pocategory) {
		jongMapper.update(pocategory);
	}

	@Override
	public void delete(Long pc_seq) {
		jongMapper.delete(pc_seq);
	}
}
