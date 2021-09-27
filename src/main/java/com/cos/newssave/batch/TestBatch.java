package com.cos.newssave.batch;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

// @Component // 그냥 IoC 컨테이너에 띄우고 싶으면 
public class TestBatch {

	int num =1;
	
	// 초 분 시 일 월 요일  
	@Scheduled(cron = "0 * * * * *", zone = "Asia/Seoul") // 매일 15시 35분 Asia/Seoul = 표준시
	public void testCount() {
		System.out.println("숫자 카운트:" + num);
		num ++;
	}
}
