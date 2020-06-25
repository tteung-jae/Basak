package com.basak.app.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.basak.app.model.MemberVO;
import com.basak.app.model.RecommendVO;
import com.basak.app.service.IRecommendService;

@Controller
public class RecommendController {
	
	private static final Logger logger = LoggerFactory.getLogger(RecommendController.class);
	
	@Autowired
	IRecommendService recommendService;
	
	/* 로그인 권한에서 동작 */
	@RequestMapping("recommend/write.do")
	public String insertRecommend(HttpSession session, @ModelAttribute RecommendVO recommend, Model model) {
		logger.info("recommend insert");
		
		MemberVO member = (MemberVO) session.getAttribute("member");
		recommend.setmemberId(member.getMemberId());
		recommendService.insertRecommend(recommend);
		return "redirect:/";
	}

	/* 로그인 권한에서 동작 */
	@RequestMapping("/recommend/delete/{recommendId}")
	public String deleteRecommend(@PathVariable int recommendId, HttpSession session, Model model) {
		logger.info("recommend delete");
		
		RecommendVO recommend = new RecommendVO();
		MemberVO member = (MemberVO) session.getAttribute("member");
		recommend.setmemberId(member.getMemberId());
		recommend.setRecommendId(recommendId);
		recommendService.deleteRecommend(recommend);
		return "redirect:/";
	}
	
	/* 미사용 : 로그인 권한에서 동작 */
	@RequestMapping("/recommend/update.do")
	public String updateRecommend(HttpSession session, int recommendId, Model model) {
		logger.info("recommend update");
		return "redirect:/";
	}
}//end class