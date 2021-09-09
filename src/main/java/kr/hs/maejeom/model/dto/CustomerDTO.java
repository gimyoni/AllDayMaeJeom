package kr.hs.maejeom.model.dto;

import java.util.Date;

public class CustomerDTO {
	
	private String userid;
	private String passwd;
	private String name;
	private int student_num;
	private int enter_year;
	private int point;
	
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStudent_num() {
		return student_num;
	}
	public void setStudent_num(int student_num) {
		this.student_num = student_num;
	}
	public int getEnter_year() {
		return enter_year;
	}
	public void setEnter_year(int enter_year) {
		this.enter_year = enter_year;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
}
