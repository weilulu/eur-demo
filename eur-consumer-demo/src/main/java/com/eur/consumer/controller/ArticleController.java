package com.eur.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.eur.consumer.feign.ArticleFeignClient;

@RestController
@RequestMapping("article")
public class ArticleController {

	@Autowired
	private ArticleFeignClient articleFeignClient;
	
	@RequestMapping(method=RequestMethod.GET,value="query")
	public ResponseEntity<String> query(){
		ResponseEntity<String> entity = articleFeignClient.query();
		return entity;
	}
}
