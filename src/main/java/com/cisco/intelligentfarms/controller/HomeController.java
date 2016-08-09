package com.cisco.intelligentfarms.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {

	@RequestMapping(value="/getDBResult", method = RequestMethod.GET)
	public String getDBResult(@RequestParam String id){
		String ide = "123";
		return ide;
	}
	
	@RequestMapping(value="/pushResultDB", method = RequestMethod.GET)
	public String pushDBResult(@RequestParam String rawData)
	{
		String rawDataJson = "RawJSON";
		return rawDataJson;
	}
}
