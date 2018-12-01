package com.clayder.spring_app;

import javax.websocket.server.PathParam;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

	@RequestMapping("/")
	@ResponseBody
	public String hello() {
		return "Olá mundo";
	}
	
	@GetMapping(path = "/say/{name}")
	@ResponseBody
	public String say(@PathVariable String name) {
		return "Hello " + name;
	}
}
