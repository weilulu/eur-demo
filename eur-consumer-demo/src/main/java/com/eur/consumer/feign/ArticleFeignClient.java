package com.eur.consumer.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name="EUR-SERVER-DEMO")
public interface ArticleFeignClient {

	@RequestMapping(method=RequestMethod.GET,value="article/info")
	ResponseEntity<String> query();
}