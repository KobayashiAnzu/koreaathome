package com.example.service;

import java.util.List;

import com.example.domain.Korean;

public interface KoreanService {

	//全件取得
	List<Korean> getKoreanList() throws Exception;

	//ランダムに全件取得
	List<Korean> getKoreanByRandom() throws Exception;

	//カテゴリ別に取得
	List<Korean> getKoreanByCategory(String category) throws Exception;

	//ページネーション用
	int getTotalPages(int numPerPage) throws Exception;
	List<Korean> getKoreanListByPage(int page, int numPerPage) throws Exception;

	//追加
	void addKorean(Korean korean) throws Exception;

	Korean getKoreanById(Integer id) throws Exception;

	//更新
	void updateKorean(Korean korean) throws Exception;

	//削除
	void deleteKorean(Integer id) throws Exception;




}