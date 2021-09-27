package com.cos.newssave.batch;

import java.util.List;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.cos.newssave.domain.News;
import com.cos.newssave.domain.NewsRepository;
import com.cos.newssave.util.NaverCraw;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Component
public class NewsBatch {

	private final NewsRepository newsRepository;
	private final NaverCraw naverCraw;
	
	// 초 분 시 일 월 요일  
		//@Scheduled(cron = "0 2 * * * *", zone = "Asia/Seoul") // 매일 15시 35분 Asia/Seoul = 표준시
	    @Scheduled(fixedDelay = 1000*60*2)
		public void newsCrawAndSave() {
	    	
	    	List<News> newsList = naverCraw.collect10();
	    	
	    	newsRepository.saveAll(newsList);
			
		}
}
