package com.animalfarm.jira.jira;

import java.io.Serializable;
import java.util.Date;

/**
 * user bean class
 */
public class JiraUser implements Serializable{

	/**
	 * 직렬화
	 */
	private static final long serialVersionUID = 1L;
	
	private String memId;
	private String memName;
	private String memPw;
	private int memRole;
	private Date regstDate;
	
	/**
	 * 회원 아이디를 리턴해준다
	 */
	public String getMemId() {
		return memId;
	}
	public void setMemId(String memId) {
		this.memId = memId;
	}
	
	/**
	 * 회원 이름을 리턴해준다
	 */
	public String getMemName() {
		return memName;
	}
	public void setMemName(String memName) {
		this.memName = memName;
	}
	
	/**
	 * 회원 패스워드를 리턴해준다
	 */
	public String getMemPw() {
		return memPw;
	}
	public void setMemPw(String memPw) {
		this.memPw = memPw;
	}
	
	/**
	 * 회원 아이디를 리턴해준다
	 */
	public int getMemRole() {
		return memRole;
	}
	public void setMemRole(int memRole) {
		this.memRole = memRole;
	}
	
	/**
	 * 회원가입 날짜를 리턴해준다
	 */
	public Date getRegstDate() {
		return regstDate;
	}
	public void setRegstDate(Date regstDate) {
		this.regstDate = regstDate;
	}
	
	
}
