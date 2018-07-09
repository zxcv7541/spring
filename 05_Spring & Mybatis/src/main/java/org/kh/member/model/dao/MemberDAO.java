package org.kh.member.model.dao;

import java.sql.Connection;

import org.kh.member.model.vo.Member;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.jdbc.core.JdbcTemplate;

public interface MemberDAO {
	public Member selectOneMember(SqlSessionTemplate sqlSession, Member vo);
}
