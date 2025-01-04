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
//        logger.info("{}",dice[0]);
//        return dice[0];
		return 0;
	}
	
	@ResponseBody
	@PostMapping("/test_3")
	public String test_3(@RequestBody Map<String, Object> param, Model model) {
		
		int[] index_list = {16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7};
		String my_string = "cvsgiorszzzmrpaqpe";
		char[] charArr = my_string.toCharArray();
		String answer = "";
		
		for (int i = 0; i < index_list.length; i++) {
			answer += charArr[index_list[i]];
		}
		
		logger.info("test_3 ::: {}",answer);
		
		return "";
	}
	
	@ResponseBody
	@PostMapping("/test_4")
	public String test_4() {
		
		int answer = 0;
		
		String number = "78720646226947352489";
		
		int cnt = 0;
		for (int i = 0; i < number.length(); i++) {
			int inx = number.charAt(i) - '0';
			cnt += inx;
		}
		
		answer = cnt % 9;
		
		logger.info("test_4 ::: {}", answer);
		
		return "";
	}
	
	@ResponseBody
	@PostMapping("/test_5")
	public String test_5() {
		
		String answer = "";
		
		String my_string = "rermgorpsam";
		int[][] queries = {{2, 3}, {0, 7}, {5, 9}, {6, 10}};
		
		for (int i = 0; i < queries.length; i++) {
			int start = queries[i][0];
			int end = queries[i][1];
			
			String temp2 = "";
			for (int x = 0; x < my_string.length(); x++) {
				String changeAft = "";
				if (x == start) {
					String temp = "";
					for (int j = end; j >= start; j--) {
						temp += my_string.charAt(j);
					}
					changeAft += temp;
					x = end;
				} else {
					changeAft += my_string.charAt(x);
				}
				temp2 += changeAft;
			}
			my_string = temp2;
		}
		
		logger.info(my_string);
		
		return "";
	}
	
	@ResponseBody
	@PostMapping("/test_6")
	public String test_6() {
		
		String[] intStrs = {
			"0123456789",
			"9876543210",
			"9999999999999"
		};
		int k = 50000;
		int s = 5;
		int l = 5;
		
		ArrayList<Integer> answer = new ArrayList<Integer>();
		for (int i = 0; i < intStrs.length; i++) {
			int temp = Integer.parseInt(intStrs[i].substring(s,s+l));
			
			if (k < temp) {
				answer.add(temp);
			}
		}
		
		logger.info("{}", answer);
		
		return "";
	}
	
	@ResponseBody
	@PostMapping("/test_7")
	public String test_7() {
		
		String answer = "";
		
		String[] my_strings = {
			"progressive",
			"hamburger",
			"hammer",
			"ahocorasick"
		};
		int[][] parts = {
			{0,4},
			{1,2},
			{3,5},
			{7,7}
		};
		
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < my_strings.length; i++) {
			builder.append(my_strings[i].substring(parts[i][0], parts[i][1]+1));
		}
		
		
		logger.info("{}", builder.toString());
		
		return "";
	}
	
	@ResponseBody
	@PostMapping("/test_8")
	public String test_8() {
		
		String answer = "";
		
		String my_string = "He110W0r1d";
		int n = 5;
		
		answer = my_string.substring(my_string.length() - n, my_string.length());
		
		logger.info("{}", answer);
		
		return answer;
	}
	
	@ResponseBody
	@PostMapping("/test_9")
	public String test_9() {
		
		String answer = "";
		
		String my_string = "banana";
		String[] stringArr = new String[my_string.length()];
		for (int i = 0; i < my_string.length(); i++) {
			stringArr[i] = my_string.substring(i);
		}
		Arrays.sort(stringArr);
		
		logger.info("{}", stringArr);
		
		return answer;
	}
	
	@ResponseBody
	@PostMapping("/test_10")
	public int test_10() {
		
		String answer = "";
		
		String my_string = "banana";
		String is_suffix = "ana";
		
		for (int i = 0; i < my_string.length(); i++) {
			if (my_string.substring(i).equals(is_suffix)) {
				return 1;
			}
		}
		
		return 0;
	}
	
	@ResponseBody
	@PostMapping("/test_11")
	public String test_11() {
		
		String answer = "";
		
		String my_string = "ProgrammerS123";
		int n = 11;
		
		answer = my_string.substring(0,n);
		
		logger.info("{}", answer);
		
		return answer;
	}
	
	@ResponseBody
	@PostMapping("/test_12")
	public String test_12() {
		
		String answer = "";
		
		String my_string = "banana";
		String is_prefix = "ban";
		
		my_string.startsWith(is_prefix);
		
		logger.info("{}", answer);
		
		return answer;
	}
	
	@ResponseBody
	@PostMapping("/test_13")
	public String test_13() {
		
		String answer = "";
		
		String my_string = "Progra21Sremm3";
		int s = 6;
		int e = 12;
		
		char[] my_char = my_string.toCharArray();
		StringBuilder sb = new StringBuilder();
		
		int count = e;
		for (int i = 0; i < my_char.length; i++) {
			if (s <= i && i <= e) {
				sb.append(my_char[count]);
				count--;
			} else if (i < s || e < i) {
				sb.append(my_char[i]);
			}
		}
		
		logger.info("{}", sb.toString());
		
		return answer;
	}
	
	@ResponseBody
	@PostMapping("/test_14")
	public String test_14() {
		
		String answer = "";
		String my_string = "ihrhbakrfpndopljhygc";
		char[] charList = my_string.toCharArray();
		int m = 4;
		int c = 2;
		int cnt = 0;
		int div = charList.length / m;
		char[][] tempChar = new char[div][m];
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < div; i++) {
			for (int j = 0; j < m; j++) {
				tempChar[i][j] = charList[cnt++];
			}
		}
		
		for (int i = 0; i < div; i++) {
			sb.append(tempChar[i][c-1]);
		}
		
		logger.info("{}", sb.toString());
		
		return answer;
	}
	
	@ResponseBody
	@PostMapping("/test_15")
	public String test_15() {
		
		String answer = "";
		String code = "qjnwezgrpirldywt";
		int q = 3;
		int r = 1;
		
		StringBuilder sb = new StringBuilder();
		for (; r < code.length(); r += q) {
			sb.append(code.charAt(r));
		}
		
		logger.info("{}", answer);
		
		return answer;
	}
	
	@ResponseBody
	@PostMapping("/test_16")
	public String test_16() {
		
		String my_string = "Programmers";
		
		char[] charList = my_string.toCharArray();
		int[] alpha = new int[52];
		
		logger.info("{}", (int)'A');
		logger.info("{}", (int)'Z');
		logger.info("{}", (int)'a');
		logger.info("{}", (int)'z');
		
		for (int temp : charList) {
			if (temp <= 90) {
				int value = alpha[temp-65];
				alpha[temp-65] = ++value;
				logger.info("{}", alpha[temp-65]);
			} else {
				int value = alpha[temp-71];
				alpha[temp-71] = ++value;
				logger.info("{}", alpha[temp-71]);
			}
		}
		
		logger.info("{}", alpha);
		
		return "";
	}
	
	@ResponseBody
	@PostMapping("/test_17")
	public int[] test_17() {
		
		int n = 10;
		int k = 3;
		int div = n / k;
		int[] answer = new int[div];
		
		for (int i = 0; i < div; i++) {
			answer[i] = (i + 1) * k;
		}
		
		logger.info("{}", answer);
		
		return answer;
	}
	
	@ResponseBody
	@PostMapping("/test_")
	public String test_() {
		
		String answer = "";
		
		logger.info("{}", answer);
		
		return answer;
	}
}



















