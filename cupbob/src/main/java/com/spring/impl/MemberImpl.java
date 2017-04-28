package com.spring.impl;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.dao.MemberDAO;
import com.spring.dto.MemberDTO;

@Repository
public class MemberImpl implements MemberDAO {
	@Inject
	SqlSession sqlSession;
	
	String nameSpace = "com.spring.mapper.MemberMapper.";
	
	@Override
	public List<MemberDTO> selectMem() {
		List<MemberDTO> list = sqlSession.selectList(nameSpace +"select");
		return list;
	}

}
