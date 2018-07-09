package org.kh.member.model.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.annotation.Resource;

import org.aspectj.lang.annotation.Aspect;
import org.kh.member.common.Log4jAdvice;
import org.kh.member.common.LogAdvice;
import org.kh.member.model.dao.MemberDAOImpl;
import org.kh.member.model.vo.Member;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service("memberService")
public class MemberServiceImpl implements MemberService {
	
	
	@Resource(name="memberDAO")
	private MemberDAOImpl memberDAO;
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	public MemberServiceImpl() {
		
	}
	
	@Override
	public Member selectOneMember(Member vo) {
	
		Member m=memberDAO.selectOneMember(sqlSession,vo);
		return m;
	}

	public int updateMember(Member vo) {
		

		int result=memberDAO.updateMember(sqlSession,vo);
		
		return result;
	}

	public int insertMember(Member vo) {
	

		int result=memberDAO.insertMember(sqlSession,vo);
		return result;
	}

	public int deleteMember(String userId) {
	

		int result=memberDAO.deleteMember(sqlSession,userId);
		return result;
	}

	public ArrayList<Member> memberAll() {
	

		ArrayList<Member> list=memberDAO.memberAll(sqlSession);
		return list;
	}

	public Member selectOneMember2(Member vo) {
		Member m=memberDAO.selectOneMember2(sqlSession,vo);
		return m;
	}
	

	
	

}
