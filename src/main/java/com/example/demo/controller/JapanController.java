package com.example.demo.controller;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.JapanService;
import com.example.demo.vo.Japan;

@RestController
public class JapanController {

	@Autowired
	private JapanService js;
	
	@GetMapping("/")
	public @ResponseBody List<Japan> getSelectList() {
		return js.selectJapanList();
	}
	
	@PostMapping("/")
	public @ResponseBody Integer insertJapan(@RequestBody Japan j) {
		return js.insertJapan(j);
	}
	
	@PutMapping("/{jpnum}")
	public @ResponseBody Integer updateJapan(@RequestBody Japan j, @PathVariable int jpnum) {
		j.setJpnum(jpnum);
		return js.updateJapan(j);
	}
	
	@DeleteMapping("/{jpnum}")
	public @ResponseBody Integer deleteJapan(@PathVariable int jpnum) {
		return js.deleteJapan(jpnum);
	}
}
