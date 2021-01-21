package com.example.service;

import com.example.domain.Member;

public interface MemberService {

	boolean isCorrectIdAndPassword(String loginId, String loginPass)throws Exception;

	//追加
	void addMember(Member member) throws Exception;

}
