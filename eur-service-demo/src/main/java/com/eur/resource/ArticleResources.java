package com.eur.resource;

import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.eur.ArticleDomain;
import com.eur.service.ArticleService;

@RestController
@RequestMapping("article")
public class ArticleResources {

	@Autowired
	private ArticleService artcieService;
	
	@RequestMapping(value="info",method=RequestMethod.GET)
	public Response getArticleById(){
		
		ArticleDomain article = artcieService.getArticleById(2);
		
		return Response.ok(JSONObject.toJSONString(article)).build();
	}
}
