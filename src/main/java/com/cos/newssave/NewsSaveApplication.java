package com.cos.newssave;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling    // 스프링 부트가 어떤 한 시간에 간헐적으로 동작
@SpringBootApplication
public class NewsSaveApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewsSaveApplication.class, args);
	}

}
