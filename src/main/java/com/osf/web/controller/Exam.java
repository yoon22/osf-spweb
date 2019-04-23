package com.osf.web.controller;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Exam {
	
	public String str;
	
//	Log4j level 순서
//	1. TRACE
//	2. DEBUG 개발할때 필요한거
//	3. INFO 말그대로 information 정보,참조,,당연히 보여져야할 정보
//	4. WARN warnning? 위험~~~
//	5. ERROR
//	6. FATAL 진~짜 치명적인 에러. 

	
	public static void main(String[] args) {
		String str = null;
		Exam e1 = new Exam();
		
		System.out.println(e1);
		
		if(str.equals("홍길동")) {
			log.info("아무튼 홍길동임!");			
		}else {
			log.debug("나도 나오나?");
			log.info("홍길동 아님");
		}
		log.warn("프로그램 비정상 종료");
	}
}
