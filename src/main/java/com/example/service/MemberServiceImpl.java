package com.example.service;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.MemberDao;
import com.example.domain.Member;

@Service

public class MemberServiceImpl implements MemberService{

	@Autowired
	MemberDao dao;

	@Override
	public void addMember(Member member) throws Exception {

		dao.insert(member);
	}

	@Override
	public boolean isCorrectIdAndPassword(String loginId, String loginPass) throws Exception {

		Member member = dao.selectByLoginId(loginId);

		//ログインIDが正しいかどうかチェック
		if(member == null) {
			return false;
		}

		//パスワードが正しいかチェック
		if(!BCrypt.checkpw(loginPass, member.getLoginPass())) {
			return false;
		}

		return true;
	}


}