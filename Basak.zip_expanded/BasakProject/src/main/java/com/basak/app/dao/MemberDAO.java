package com.basak.app.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.basak.app.Hash;
import com.basak.app.model.MemberVO;

@Repository
public class MemberDAO implements IMemberDAO{

	@Inject
	SqlSession sqlSession;
	
	@Override
	public List<MemberVO> memberList() {
		return sqlSession.selectList("member.memberList");
	}
	
	@Override
	public MemberVO login(MemberVO vo) {
		Hash hash = new Hash();
		vo.setMemberPw(hash.hash(vo.getMemberPw()));
		return sqlSession.selectOne("member.login", vo);
	}
	
	@Override
	public void insertMember(MemberVO vo) {
		Hash hash = new Hash();
		vo.setMemberPw(hash.hash(vo.getMemberPw()));
		sqlSession.insert("member.insertMember", vo);
	}
}
