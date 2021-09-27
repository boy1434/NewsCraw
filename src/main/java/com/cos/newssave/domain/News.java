package com.cos.newssave.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@AllArgsConstructor
@Document(collection = "news")
@Data
public class News {
	@Id
	private String _id;
	
	private String title;
	private String time;
	
	
	
}
