package com.spring.service;

import java.util.List;

import com.spring.dto.MemberDTO;

public interface IMemberService {
	public List<MemberDTO> selectMember();
}
