package tn.camepofico.service;


import tn.camepofico.domain.Pocategory;

import java.util.List;

public interface JongService {
	List<Pocategory> list();
	void insertCat(Pocategory pocategory);
	Pocategory findBySeq(Long pc_seq);
	void update(Pocategory pocategory);
	void delete(Long pc_seq);
}
