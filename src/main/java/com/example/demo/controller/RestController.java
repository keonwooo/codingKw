package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("restApi")
public class RestController {
	
	private final Logger logger = LoggerFactory.getLogger(RestController.class);

	@ResponseBody
	@PostMapping("/test_1")
	public String test_1(@RequestBody List<Map<String, Object>> param, Model model) {
		
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
	
	@ResponseBody
	@PostMapping("/test_2")
	public int test_2(@RequestBody Map<String, Object> param, Model model) {
		
		logger.info("{}",param);
		
		int answer = 0;
		int a = Integer.parseInt((String) param.get("a")); 
		int b = Integer.parseInt((String) param.get("b")); 
		int c = Integer.parseInt((String) param.get("c")); 
		int d = Integer.parseInt((String) param.get("d"));
		
		// 주사위 값을 배열에 저장하고 정렬
        int[] dice = {a, b, c, d};
        Arrays.sort(dice);

        // 모두 같은 경우
        if (dice[0] == dice[3]) {
        	logger.info("{}",1111 * dice[0]);
            return 1111 * dice[0];
        }

        // 세 개가 같고 하나가 다른 경우
        if (dice[0] == dice[2] || dice[1] == dice[3]) {
            int p = (dice[0] == dice[2]) ? dice[0] : dice[1];
            int q = (dice[0] == dice[2]) ? dice[3] : dice[0];
            logger.info("{}",Math.pow(10 * p + q, 2));
            return (int) Math.pow(10 * p + q, 2);
        }

        // 두 개씩 같은 경우
        if (dice[0] == dice[1] && dice[2] == dice[3]) {
            int p = dice[0];
            int q = dice[2];
            logger.info("{}",(p + q) * Math.abs(p - q));
            return (p + q) * Math.abs(p - q);
        }

        // 두 개가 같고 나머지 두 개가 다른 경우
        if (dice[0] == dice[1] || dice[1] == dice[2] || dice[2] == dice[3]) {
            int p = (dice[0] == dice[1]) ? dice[0] : (dice[1] == dice[2]) ? dice[1] : dice[2];
            List<Integer> others = new ArrayList<>();
            for (int num : dice) {
                if (num != p) others.add(num);
            }
            logger.info("{}",others.get(0) * others.get(1));
            return others.get(0) * others.get(1);
        }


        // 모두 다른 경우
        logger.info("{}",dice[0]);
        return dice[0];
	}
}
