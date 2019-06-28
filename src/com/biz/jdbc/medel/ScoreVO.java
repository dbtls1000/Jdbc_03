package com.biz.jdbc.medel;

public class ScoreVO {
	private long sc_seq;
	private String sc_date;
	private String sc_no;
	private String sc_subject;
	private int sc_score;
	
	public ScoreVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ScoreVO(long sc_seq, String sc_date, String sc_no, String sc_subject, int sc_score) {
		super();
		this.sc_seq = sc_seq;
		this.sc_date = sc_date;
		this.sc_no = sc_no;
		this.sc_subject = sc_subject;
		this.sc_score = sc_score;
	}
	public long getSc_seq() {
		return sc_seq;
	}
	public void setSc_seq(long sc_seq) {
		this.sc_seq = sc_seq;
	}
	public String getSc_date() {
		return sc_date;
	}
	public void setSc_date(String sc_date) {
		this.sc_date = sc_date;
	}
	public String getSc_no() {
		return sc_no;
	}
	public void setSc_no(String sc_no) {
		this.sc_no = sc_no;
	}
	public String getSc_subject() {
		return sc_subject;
	}
	public void setSc_subject(String sc_subject) {
		this.sc_subject = sc_subject;
	}
	public int getSc_score() {
		return sc_score;
	}
	public void setSc_score(int sc_score) {
		this.sc_score = sc_score;
	}
	@Override
	public String toString() {
		return "ScoreVO [sc_seq=" + sc_seq + ", sc_date=" + sc_date + ", sc_no=" + sc_no + ", sc_subject=" + sc_subject
				+ ", sc_score=" + sc_score + "]";
	}
	
}
