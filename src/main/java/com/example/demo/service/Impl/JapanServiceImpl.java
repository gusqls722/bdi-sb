package com.example.demo.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.JapanDAO;
import com.example.demo.service.JapanService;
import com.example.demo.vo.Japan;

@Service
public class JapanServiceImpl implements JapanService{
	

	@Autowired
	private JapanDAO jdao;
	
	@Override
	public List<Japan> selectJapanList() {
		return jdao.selectJapanList();
	}

	@Override
	public Integer insertJapan(Japan j) {
		return jdao.insertJapan(j);
	}

	@Override
	public Integer updateJapan(Japan j) {
		return jdao.updateJapan(j);
	}

	@Override
	public Integer deleteJapan(int jpnum) {
		return jdao.deleteJapan(jpnum);
	}

}
