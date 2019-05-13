package com.rbc.zv60.service.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Controller {
	
	 //@GetMapping("hell")
	 @GetMapping("/{type}/{name}")
	 //@PathVariable String type, @PathVariable String name, @RequestBody LoginForm loginForm
	 public String HController(@PathVariable String type, @PathVariable String name, @RequestBody LoginForm loginForm) {
		// return "Hi type: "+type+" login: " + loginForm.name;
		return "Hi type: "+ type +" name: "+ name + " login: " + loginForm.name +" " +loginForm.type;
	 }

}
