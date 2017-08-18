package demo.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Context;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;

@RestController
public class TestController {

	@RequestMapping("/test")
	public String test(@Context HttpServletRequest request){
		String test = "{\"1\":\"test\"}";
		JSONObject object = JSONObject.parseObject(test);
		
		return object.toJSONString();
	}
}
