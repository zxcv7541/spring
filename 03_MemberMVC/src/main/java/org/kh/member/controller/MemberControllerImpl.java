package org.kh.member.controller;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.kh.member.model.service.MemberServiceImpl;
import org.kh.member.model.vo.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class MemberControllerImpl implements MemberController{
	
	@Autowired
	@Qualifier(value="memberService")
	private MemberServiceImpl memberService;
	
	@Override
	public String selectOneMember(HttpServletRequest request, HttpServletResponse response) {
		//1.값 추출
		Member vo=new Member();
		vo.setUserId(request.getParameter("userId"));
		vo.setUserPw(request.getParameter("userPw"));
		return null;
	}
	
	@RequestMapping(value="/login.do")
	public String selectOneMember(HttpServletRequest request,@RequestParam String userId,@RequestParam String userPw) {
		//1.값 추출
		Member vo=new Member();
		vo.setUserId(userId);
		vo.setUserPw(userPw);
		
		//2.비즈니스 로직 처리
		Member m=memberService.selectOneMember(vo);
		
		HttpSession session=request.getSession();
		
		//3.viewName 리턴
		if(m!=null) {
			session.setAttribute("member", m);
			return "member/loginSuccess";
		}else {
			return "member/loginFailed";
		}

	}
	
	@RequestMapping(value="/enroll.do")
	public String insertMember() {
		return null;
	}

}
