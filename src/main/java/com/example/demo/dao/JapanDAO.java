package com.example.demo.dao;

import java.util.List;

import com.example.demo.vo.Japan;

public interface JapanDAO {

	public List<Japan> selectJapanList(); 
	public Integer insertJapan(Japan j);
	public Integer updateJapan(Japan j);
	public Integer deleteJapan(int jpnum);
	
}
