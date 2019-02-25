package com.kh.god.common.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.kh.god.member.model.vo.Member;
import com.kh.god.seller.model.vo.Seller;

/**
 * 로그인하지 않고, /member/memberView.do?memberId=gr1234 /member/memberUpdate.do 등을
 * 요청시 로그인 여부를 검사하고, 로그인 하지 않았다면, common/msg.jsp 에서 경고메세지 출력
 */
public class LoginCheckInterceptor extends HandlerInterceptorAdapter {

	Logger logger = Logger.getLogger(getClass());

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		// 주소랑 로그인한 사람이 다를때
		String memberId = request.getParameter("memberId");
		HttpSession session = request.getSession();
		Member memberLoggedIn = (Member) session.getAttribute("memberLoggedIn");

		/*
		 * if(memberLoggedIn == null || !memberId.equals(memberLoggedIn.getMemberId()))
		 * { request.setAttribute("msg", "로그인 후 이용하실 수 있습니다");
		 * request.setAttribute("loc", "/");
		 * request.getRequestDispatcher("/WEB-INF/views/common/msg.jsp").forward(
		 * request, response);
		 * 
		 * Seller sellerLoggedIn = (Seller)session.getAttribute("sellerLoggedIn");
		 * 아무나 memberView 못보게 막음, 결제 직전 페이지에서 장바구니 보여줌
		 * return false; }
		 */

		
		 if(memberLoggedIn == null) { Seller sellerLoggedIn =
		 (Seller)session.getAttribute("sellerLoggedIn"); }
		 

		return super.preHandle(request, response, handler); // 이 값은 항상 트루
	}

}
