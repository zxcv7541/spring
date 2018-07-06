package org.kh.member.model.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.annotation.Resource;

import org.kh.member.common.Log4jAdvice;
import org.kh.member.common.LogAdvice;
import org.kh.member.model.dao.MemberDAOImpl;
import org.kh.member.model.vo.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service("memberService")
public class MemberServiceImpl implements MemberService {
	
	
	@Resource(name="memberDAO")
	private MemberDAOImpl memberDAO;
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public MemberServiceImpl() {
		
	}
	
	@Override
	public Member selectOneMember(Member vo) {
		System.out.println("비즈니스 로직 호출");
		Member m=memberDAO.selectOneMember(jdbcTemplate,vo);
		return m;
	}

	public int updateMember(Member vo) {
		System.out.println("비즈니스 로직 호출");

		int result=memberDAO.updateMember(jdbcTemplate,vo);
		
		return result;
	}

	public int insertMember(Member vo) {
		System.out.println("비즈니스 로직 호출");

		int result=memberDAO.insertMember(jdbcTemplate,vo);
		return result;
	}

	public int deleteMember(String userId) {
		System.out.println("비즈니스 로직 호출");

		int result=memberDAO.deleteMember(jdbcTemplate,userId);
		return result;
	}

	public ArrayList<Member> memberAll() {
		System.out.println("비즈니스 로직 호출");

		ArrayList<Member> list=memberDAO.memberAll(jdbcTemplate);
		return list;
	}
	

	
	

}
