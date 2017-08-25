package com.eur.config;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import com.eur.resource.ArticleResources;



@Configuration
@ApplicationPath("/v1")
public class JerseyConfig extends ResourceConfig{

	public JerseyConfig() {
		registerEndpoints();
		
		// 注册异常处理类和swagger相关Provider
				//packages("com.jyall.exception.handler", "com.wordnik.swagger.jersey.listing");
				// 注册Resource，约定为上级目录resource下
				//String packageName = JerseyConfig.class.getPackage().getName();
				// 所有resource自动扫描，不需要再依次手动添加
				//packages(packageName.substring(0, packageName.lastIndexOf(".")) + ".resource");
	}

	/**
	 * 注册 Resource (RESTful Web Service Endpoints)
	 */
	private void registerEndpoints() {
		register(ArticleResources.class);
	}

}
