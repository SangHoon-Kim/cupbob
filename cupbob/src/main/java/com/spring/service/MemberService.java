package com.spring.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.MemberDAO;
import com.spring.dto.MemberDTO;

@Service
public class MemberService implements IMemberService{
	
	@Inject
	private MemberDAO memberDAO;
	
	@Override
	public List<MemberDTO> selectMember() {
		List<MemberDTO> list = memberDAO.selectMem();
		return list;
	}

}
