package com.example.dao;

import org.apache.ibatis.annotations.Mapper;

import com.example.domain.Member;

@Mapper
public interface MemberDao {

	Member selectByLoginId(String loginId) throws Exception;

	void insert(Member member) throws Exception;



}
