package com.biz.jdbc.service;

import java.util.List;

import com.biz.jdbc.medel.ScoreVO;

public interface ScoreService {
	public List<ScoreVO> selectAll();
	public ScoreVO findBySeq(long seq);
	
	public List<ScoreVO> findByStNum(String stNum);
	
	public int insert(ScoreVO vo);
	public int update(ScoreVO vo);
	public int delete(long seq);
	public void makeScore(ScoreVO vo , String strNum);
	
}
