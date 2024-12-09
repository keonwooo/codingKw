package com.example.demo.controller;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.Util.utilKw;

import jakarta.servlet.http.HttpServletRequest;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("restApi")
public class RestController {
	
	private final Logger logger = LoggerFactory.getLogger(RestController.class);

	@ResponseBody
	@PostMapping("/test_1")
	public String mainView(@RequestBody List<Map<String, Object>> param, Model model) {
		
		logger.info("{}",param);
		
//		String x1 = utilKw.isNotEmpty(request.getParameter("x1")) ? request.getParameter("x1") : ""; 
//		String x2 = utilKw.isNotEmpty(request.getParameter("x2")) ? request.getParameter("x2") : ""; 
//		String x3 = utilKw.isNotEmpty(request.getParameter("x3")) ? request.getParameter("x3") : ""; 
//		String x4 = utilKw.isNotEmpty(request.getParameter("x4")) ? request.getParameter("x4") : ""; 
//		
//		boolean x1b = Boolean.parseBoolean(x1);
//		boolean x2b = Boolean.parseBoolean(x2);
//		boolean x3b = Boolean.parseBoolean(x3);
//		boolean x4b = Boolean.parseBoolean(x4);
//		
//		logger.info("x1 ::: {}", x1);
//		logger.info("x2 ::: {}", x2);
//		logger.info("x3 ::: {}", x3);
//		logger.info("x4 ::: {}", x4);
//
//		boolean answer = (x1b || x2b) && (x3b || x4b); 

//		return answer;
		return "";
	}
}
