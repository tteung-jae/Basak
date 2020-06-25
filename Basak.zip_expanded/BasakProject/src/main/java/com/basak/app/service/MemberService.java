package com.basak.app.service;

import java.util.List;

import javax.inject.Inject;
import org.springframework.stereotype.Service;

import com.basak.app.dao.MemberDAO;
import com.basak.app.model.MemberVO;

@Service
public class MemberService implements IMemberService{

	@Inject
	MemberDAO memberDao;
	
	@Override
	public List<MemberVO> memberList() {
		return memberDao.memberList();
	}
	
	@Override
	public void insertMember(MemberVO vo) {
		memberDao.insertMember(vo);	
	}
	
	@Override
	public MemberVO login(MemberVO vo) {
		return memberDao.login(vo);
	}
}
