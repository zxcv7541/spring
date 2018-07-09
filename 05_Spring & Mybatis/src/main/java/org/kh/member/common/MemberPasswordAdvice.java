package org.kh.member.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.kh.member.model.vo.Member;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class MemberPasswordAdvice {
	
	@Pointcut("execution(* org.kh.member.model.service.*ServiceImpl.insertMember(..))")
	public void encrytionPass() {}
	
	@Pointcut("execution(* org.kh.member.model.service.*ServiceImpl.updateMember(..))")
	public void updateMember() {}
	
	@Pointcut("execution(* org.kh.member.model.service.*ServiceImpl.selectOneMember(..))")
	public void login() {}
	
	@Before("login()")
	public void login(JoinPoint jp)throws Exception{
		Member vo=(Member)(jp.getArgs()[0]);
		String userPw=vo.getUserPw();
		String encryPw=SHA256Util.encryData(userPw);
		vo.setUserPw(encryPw);
	}
	
	@Before("updateMember()")
	public void updateMember(JoinPoint jp)throws Exception{
		Member vo=(Member)(jp.getArgs()[0]);
		String userPw=vo.getUserPw();
		String encryPw=SHA256Util.encryData(userPw);
		vo.setUserPw(encryPw);
	}
	
	
	
	
	@Before("encrytionPass()")
	public void passwordEncrytion(JoinPoint jp)throws Exception{
		Member vo=(Member)(jp.getArgs()[0]);
		
		String userPw=vo.getUserPw();
		String encryPw=SHA256Util.encryData(userPw);
		vo.setUserPw(encryPw);
		System.out.println("비밀번호암호화 완료");
	}
}
