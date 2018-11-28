package com.example.demo.vo;

public class Japan {

	private Integer jpnum;
	private String jpdesc;
	private String jpname;
	public Integer getJpnum() {
		return jpnum;
	}
	public void setJpnum(Integer jpnum) {
		this.jpnum = jpnum;
	}
	public String getJpdesc() {
		return jpdesc;
	}
	public void setJpdesc(String jpdesc) {
		this.jpdesc = jpdesc;
	}
	public String getJpname() {
		return jpname;
	}
	public void setJpname(String jpname) {
		this.jpname = jpname;
	}
	@Override
	public String toString() {
		return "Japan [jpnum=" + jpnum + ", jpdesc=" + jpdesc + ", jpname=" + jpname + "]";
	}
	
	
}
