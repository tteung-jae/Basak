package com.basak.app.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.basak.app.model.SnackVO;

public interface ISnackRepository {
	/* 검색창 */
	//회사별
	List<SnackVO> getCompanyInfo();
	//종류별
	List<SnackVO> getCategoryInfo();
	
	/* 리스트 */
	//전체 리스트
	List<SnackVO> getSnackId();
	/* 회사별, 종류별 검색으로 쿼리하였을때 return값이 null인 문제 미해결 */
	/* 현재는 회사, 리스트의 종류가 적기때문에 각각 처리 */
	// 미사용 : 회사별 리스트
	List<SnackVO> getSnackCompany(@Param("company") String company);
	//롯데제과
	List<SnackVO> getSnackCompanyLot();
	//해태
	List<SnackVO> getSnackCompanyHae();
	//크라운
	List<SnackVO> getSnackCompanyCrow();
	//청우
	List<SnackVO> getSnackCompanyChun();
	//오리온
	List<SnackVO> getSnackCompanyOri();
	
	// 미사용 : 종류별 리스트
	List<SnackVO> getSnackCategory(@Param("category") String category);
	//비스킷
	List<SnackVO> getSnackCategoryBis();
	//초콜릿
	List<SnackVO> getSnackCategoryCho();
	//케이크
	List<SnackVO> getSnackCategoryCake();
	
	/* 상세조회 */
	//ID에 따른 과자 정보
	SnackVO getSnackInfo(@Param("snackId") int snackId);
	
	/* 미사용 */
	//저장
	void insertSnack(SnackVO snack);
	//수정
	void updateSnack(SnackVO snack);
	//삭제
	void deleteSnack(@Param("snackID") int snackId);
}
