package org.kh.member.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.kh.member.model.vo.Member;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("memberDAO")
public class MemberDAOImpl implements MemberDAO{

	@Override
	public Member selectOneMember(SqlSessionTemplate sqlSession, Member vo) {	
		return sqlSession.selectOne("member.selectOneMember",vo);
		
		

	}

	public int updateMember(SqlSessionTemplate sqlSession, Member vo) {
		return sqlSession.update("member.updateMember",vo);
	}

	public int insertMember(SqlSessionTemplate sqlSession, Member vo) {
		return sqlSession.insert("member.insertMember",vo);
	}

	public int deleteMember(SqlSessionTemplate sqlSession, String userId) {
		return sqlSession.delete("member.deleteMember",userId);
	}

	public ArrayList<Member> memberAll(SqlSessionTemplate sqlSession) {
		List list=sqlSession.selectList("member.memberAll");
		return (ArrayList<Member>)list;
	}

	public Member selectOneMember2(SqlSessionTemplate sqlSession, Member vo) {
		return sqlSession.selectOne("member.selectOneMember",vo);
	}

}
