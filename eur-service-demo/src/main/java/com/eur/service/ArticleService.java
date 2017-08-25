package com.eur.service;

import org.springframework.stereotype.Service;

import com.eur.ArticleDomain;

@Service
public class ArticleService {

	public ArticleDomain getArticleById(long articleId){
		ArticleDomain article = new ArticleDomain();
		article.setAuthor("W.lu");
		article.setContent("This is a content...");
		article.setTitle("fun");
		article.setId(articleId);
		return article;
	}
}
