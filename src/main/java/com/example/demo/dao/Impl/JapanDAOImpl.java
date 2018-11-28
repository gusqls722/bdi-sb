package com.example.demo.dao.Impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.dao.JapanDAO;
import com.example.demo.vo.Japan;

@Repository
public class JapanDAOImpl implements JapanDAO {

	@Autowired
	private SqlSession ss;
	@Override
	public List<Japan> selectJapanList() {
		return ss.selectList("com.example.demo.JAPAN.selectJapan");
	}
	@Override
	public Integer insertJapan(Japan j) {
		return ss.insert("com.example.demo.JAPAN.insertJapan", j);
	}
	@Override
	public Integer updateJapan(Japan j) {
		return ss.update("com.example.demo.JAPAN.updateJapan", j);
	}
	@Override
	public Integer deleteJapan(int jpnum) {
		return ss.delete("com.example.demo.JAPAN.deleteJapan", jpnum);
	}
	
	
	

}
