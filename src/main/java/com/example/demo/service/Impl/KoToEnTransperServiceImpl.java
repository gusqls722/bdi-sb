package com.example.demo.service.Impl;

import org.springframework.stereotype.Service;

import com.example.demo.service.KoToEnTransperService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class KoToEnTransperServiceImpl implements KoToEnTransperService {

	private String clientId = "jGMDCPYvjnCVgTcE54Q5";
	private String clientSecret = "y2C9el96ex";
	@Override
	public String transper(String koText) {
		log.info("input Text=>{}",koText);
		
		return null;
	}

}
