package com.basak.app.service;

import java.util.List;

import com.basak.app.model.MemberVO;

public interface IMemberService {
	// 회원 목록
	public List<MemberVO> memberList();
	// 회원 등록 처리
	public void insertMember(MemberVO vo);
	// 로그인
	public MemberVO login(MemberVO vo);
}
