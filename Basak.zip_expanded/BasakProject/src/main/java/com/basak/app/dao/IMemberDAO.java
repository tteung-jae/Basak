package com.basak.app.dao;

import java.util.List;

import com.basak.app.model.MemberVO;

public interface IMemberDAO {
	// 회원 목록
	public List<MemberVO> memberList();
	// 로그인
	public MemberVO login(MemberVO vo);
	// 회원가입
	public void insertMember(MemberVO vo);
}
