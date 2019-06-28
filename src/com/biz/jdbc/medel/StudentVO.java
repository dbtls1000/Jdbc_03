package com.biz.jdbc.medel;

public class StudentVO {
	private String st_no;
	private String st_name;
	private String st_addr;
	private int st_grade;
	private int st_height;
	private int st_weight;
	private String st_nick;
	private String st_nick_rem;
	private String st_dept_no;
	
	
	public StudentVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentVO(String st_no, String st_name, String st_addr, int st_grade, int st_height, int st_weight,
			String st_nick, String st_nick_rem, String st_dept_no) {
		super();
		this.st_no = st_no;
		this.st_name = st_name;
		this.st_addr = st_addr;
		this.st_grade = st_grade;
		this.st_height = st_height;
		this.st_weight = st_weight;
		this.st_nick = st_nick;
		this.st_nick_rem = st_nick_rem;
		this.st_dept_no = st_dept_no;
	}
	public String getSt_no() {
		return st_no;
	}
	public void setSt_no(String st_no) {
		this.st_no = st_no;
	}
	public String getSt_name() {
		return st_name;
	}
	public void setSt_name(String st_name) {
		this.st_name = st_name;
	}
	public String getSt_addr() {
		return st_addr;
	}
	public void setSt_addr(String st_addr) {
		this.st_addr = st_addr;
	}
	public int getSt_grade() {
		return st_grade;
	}
	public void setSt_grade(int st_grade) {
		this.st_grade = st_grade;
	}
	public int getSt_height() {
		return st_height;
	}
	public void setSt_height(int st_height) {
		this.st_height = st_height;
	}
	public int getSt_weight() {
		return st_weight;
	}
	public void setSt_weight(int st_weight) {
		this.st_weight = st_weight;
	}
	public String getSt_nick() {
		return st_nick;
	}
	public void setSt_nick(String st_nick) {
		this.st_nick = st_nick;
	}
	public String getSt_nick_rem() {
		return st_nick_rem;
	}
	public void setSt_nick_rem(String st_nick_rem) {
		this.st_nick_rem = st_nick_rem;
	}
	public String getSt_dept_no() {
		return st_dept_no;
	}
	public void setSt_dept_no(String st_dept_no) {
		this.st_dept_no = st_dept_no;
	}
	@Override
	public String toString() {
		return "StudentVO [st_no=" + st_no + ", st_name=" + st_name + ", st_addr=" + st_addr + ", st_grade=" + st_grade
				+ ", st_height=" + st_height + ", st_weight=" + st_weight + ", st_nick=" + st_nick + ", st_nick_rem="
				+ st_nick_rem + ", st_dept_no=" + st_dept_no + "]";
	}
	
}
