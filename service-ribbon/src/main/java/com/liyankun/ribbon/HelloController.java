package com.liyankun.ribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@Autowired
	HelloService helloService;
	
	@GetMapping(value = "/hello")
	public String hello(@RequestParam String name) {
		return helloService.helloService(name);
	}
}
