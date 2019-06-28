package com.biz.jdbc.service;

import java.util.List;

import com.biz.jdbc.medel.StudentVO;

public interface StdService {

	public List<StudentVO> sellectAll();
	
	//select 실행해서 데이터를 조회할때 
	//분명히 1개의 데이터만 조회 될것이다
	//라고하면 return타입으로 vo
	public StudentVO findByNum(String stNo);
	
	//확률적으로 대부분 1개의 데이터가 조회 될 것이지만
	//어쩌다 한번이라도 1개 이상의 데이터가 조회 될 것 같다
	//라고하면 리턴 타입은 무조건 List를 사용
	public List<StudentVO> findByName(String strName);
	
	public int insert(StudentVO vo);
	public int update(StudentVO vo);
	public int delete(String stNo);
	
	public void makeNum();
	
}
