package com.eur.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.eur.ArticleDomain;
import com.eur.service.ArticleService;

@Component
@Path(value="/article")
@Produces(MediaType.APPLICATION_JSON)
public class ArticleResources {

	@Autowired
	private ArticleService artcieService;
	
	@GET
	@Path("/info")
	public Response getArticleById(){
		
		ArticleDomain article = artcieService.getArticleById(2);
		
		return Response.ok(article).build();
	}
}
