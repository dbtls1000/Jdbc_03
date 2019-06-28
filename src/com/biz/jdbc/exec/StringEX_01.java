package com.biz.jdbc.exec;

public class StringEX_01 {
	public static void main(String[] args) {
		
		String sNum = "0001";
		int intLength = sNum.length();
		
		int intNum = Integer.valueOf(sNum) + 1; //2
		sNum = "00000" + intNum; // 000002
		sNum = sNum.substring(sNum.length()- intLength);
		System.out.println(sNum);
		
		//010-9652-****
		String tel = "010-9652-9999";
		String telSec = tel.substring(0,tel.length() - 4 );
		telSec += "****";
		System.out.println(telSec);
		
	}
}
