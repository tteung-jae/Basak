package com.basak.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.basak.app.dao.ISnackRepository;
import com.basak.app.model.SnackVO;

@Service
public class SnackService implements ISnackService {
	
	@Autowired
	@Qualifier("ISnackRepository")
	ISnackRepository snackRepository;

	/* 검색창 */
	//회사별
	@Override
	public List<SnackVO> getCompanyInfo() {
		return snackRepository.getCompanyInfo();
	}
	//종류별
	@Override
	public List<SnackVO> getCategoryInfo() {
		return snackRepository.getCategoryInfo();
	}

	/* 리스트 */
	//전체 리스트
	@Override
	public List<SnackVO> getSnackId() {
		return snackRepository.getSnackId();
	}
	/* 회사별, 종류별 검색으로 쿼리하였을때 return값이 null인 문제 미해결 */
	/* 현재는 회사, 리스트의 종류가 적기때문에 각각 처리 */
	//회사별 리스트
	@Override
	public List<SnackVO> getSnackCompany(String company){
		if(company.equals("롯데제과")) {			
			return snackRepository.getSnackCompanyLot();
		} else if(company.equals("해태")) {
			return snackRepository.getSnackCompanyHae();
		} else if(company.equals("크라운")) {
			return snackRepository.getSnackCompanyCrow();
		} else if(company.equals("청우")) {
			return snackRepository.getSnackCompanyChun();
		} else if(company.equals("오리온")) {
			return snackRepository.getSnackCompanyOri();
		}
		return snackRepository.getSnackId();
	}
	//종류별 리스트
	@Override
	public List<SnackVO> getSnackCategory(String category){
		if(category.equals("비스킷")) {			
			return snackRepository.getSnackCategoryBis();
		} else if(category.equals("초콜릿")) {
			return snackRepository.getSnackCategoryCho();
		} else if(category.equals("케이크")) {
			return snackRepository.getSnackCategoryCake();			
		}
		return snackRepository.getSnackId();
	}
	
	/* 상세조회 */
	//ID에 따른 과자 정보
	@Override
	public SnackVO getSnackInfo(int snackId) {
		return snackRepository.getSnackInfo(snackId);
	}
	
	/* 미사용 */
	//저장
	@Override
	public void insertSnack(SnackVO snack) {
		snackRepository.insertSnack(snack);
	}
	//수정
	@Override
	public void updateSnack(SnackVO snack) {
		snackRepository.updateSnack(snack);
	}
	//삭제
	@Override
	@Transactional
	public void deleteSnack(int snackID) {
		snackRepository.deleteSnack(snackID);
	}
}