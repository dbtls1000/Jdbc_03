package com.biz.jdbc.exec;

import java.util.Scanner;

import com.biz.jdbc.medel.ScoreVO;
import com.biz.jdbc.service.ScoreService;
import com.biz.jdbc.service.ScoreServiceImp_01;

public class ScExec_01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ScoreService ss = new ScoreServiceImp_01();
		while(true) {
			ScoreVO vo = new ScoreVO();
			
			System.out.print("날짜 입력 >");
			vo.setSc_date(scan.nextLine());
			System.out.print("학번 입력 >");
			vo.setSc_no(scan.nextLine());
			System.out.print("과목 입력 >");
			vo.setSc_subject(scan.nextLine());
			System.out.print("점수 입력 >");
			vo.setSc_score(Integer.valueOf(scan.nextLine()));
			
			if(ss.insert(vo) > 0) System.out.println("추가 완료");
			else System.out.println("추가 실패");
		}
	}
}
