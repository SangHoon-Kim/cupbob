package com.spring.dao;

import java.util.List;

import com.spring.dto.MemberDTO;

public interface MemberDAO {
	public List<MemberDTO> selectMem();
}
