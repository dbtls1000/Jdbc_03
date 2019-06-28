package com.biz.jdbc.service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.jdbc.config.DBConnection;
import com.biz.jdbc.medel.ScoreVO;

public class ScoreServiceImp_01 implements ScoreService {
	Scanner scan ;
	public ScoreServiceImp_01() {
		// TODO Auto-generated constructor stub
		scan = new Scanner(System.in);
	}
	@Override
	public List<ScoreVO> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ScoreVO findBySeq(long seq) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ScoreVO> findByStNum(String stNum) {
		// TODO Auto-generated method stub
		String sql = " SELECT * FROM tbl_score ";
		sql += " WHERE sc_no = ? ";
		PreparedStatement ps = null;
		try {
			ps = DBConnection.dbCon.prepareStatement(sql);
			ps.setString(3, stNum);
			
			ResultSet rs = ps.executeQuery();
			List<ScoreVO> scList = new ArrayList<ScoreVO>();
			while(rs.next()) {
				ScoreVO vo = new ScoreVO(
						rs.getLong("SC_SEQ"), 
						rs.getString("SC_DATE"),
						rs.getString("SC_NO"),
						rs.getString("SC_SUBJECT"),
						rs.getInt("SC_SCORE")
						);
				scList.add(vo);
			}
			return scList;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public int insert(ScoreVO vo) {
		// TODO Auto-generated method stub
		String sql = " INSERT INTO tbl_score( ";
		sql += " SC_SEQ, ";
		sql += " SC_DATE, ";
		sql += " SC_NO, ";
		sql += " SC_SUBJECT, ";
		sql += " SC_SCORE) ";
		sql += " VALUES(SEQ_SCORE.NEXTVAL,?,?,?,?) ";
		PreparedStatement ps = null;
		try {
			ps = DBConnection.dbCon.prepareStatement(sql);
			ps.setString(1, vo.getSc_date());
			ps.setString(2, vo.getSc_no());
			ps.setString(3, vo.getSc_subject());
			ps.setInt(4, vo.getSc_score());
			
			return ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int update(ScoreVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(long seq) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public void makeScore(ScoreVO scVO,String strNum) {
		System.out.println("입력한 학생의 성적정보를 입력합니다");
		System.out.print("날짜입력 >>");
		scVO.setSc_date(scan.nextLine());
		System.out.println("학번입력 >> "+strNum);
		scVO.setSc_no(strNum);
		System.out.print("과목입력 >>");
		scVO.setSc_subject(scan.nextLine());
		System.out.print("성적입력 >>");
		scVO.setSc_score(Integer.valueOf(scan.nextLine()));
	}
}
