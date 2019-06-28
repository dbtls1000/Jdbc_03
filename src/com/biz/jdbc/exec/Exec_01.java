package com.biz.jdbc.exec;

import java.util.Scanner;

import com.biz.jdbc.medel.ScoreVO;
import com.biz.jdbc.medel.StudentVO;
import com.biz.jdbc.service.ScoreService;
import com.biz.jdbc.service.ScoreServiceImp_01;
import com.biz.jdbc.service.StdService;
import com.biz.jdbc.service.StdServiceImp_01;

public class Exec_01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StdService sts = new StdServiceImp_01();
		ScoreService scs = new ScoreServiceImp_01();
		while(true) {
			ScoreVO scVO = new ScoreVO();
			System.out.print("학번입력(종료:-E) >>");
			String strNum = scan.nextLine();
			StudentVO stVO = sts.findByNum(strNum);
			if(strNum.equals("-E")) break;
			if(stVO == null) {
				stVO = new StudentVO();
				System.out.println("학생정보가 없으므로 새로 입력합니다");
				System.out.println("학번입력 >> " + strNum);
				stVO.setSt_no(strNum);
				System.out.print("이름입력 >>");
				stVO.setSt_name(scan.nextLine());
				System.out.print("학년입력 >>");
				stVO.setSt_grade(Integer.valueOf(scan.nextLine()));
				System.out.print("학과입력 >>");
				stVO.setSt_dept_no(scan.nextLine());
				
				if(sts.insert(stVO) >0 )System.out.println("학생정보 입력 완료");
				
				scs.makeScore(scVO, strNum);
				
				if(scs.insert(scVO) > 0) System.out.println("학생성적 입력 완료");
			}
			
			else {
				scs.makeScore(scVO, strNum);
				
				if(scs.insert(scVO) > 0) System.out.println("학생성적 입력 완료");
			}
		}
		System.out.println("학생정보 입력시스템을 종료합니다");
		
	}
}
