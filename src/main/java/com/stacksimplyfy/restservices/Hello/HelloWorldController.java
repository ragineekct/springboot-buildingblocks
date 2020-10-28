package com.stacksimplyfy.restservices.Hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



//controller
@RestController
public class HelloWorldController {
	
// simple method
	//URI -/helloworld
	//GET
	//@RequestMapping(method= RequestMethod.GET ,path="/helloworld")
	@GetMapping("/helloworld1")
	public String helloworld() {
		return "Hello World 1";
	}

	@GetMapping("/helloworld-bean")
	public UserDetails helloworldBean()
	{
		return new UserDetails("Raginee","Rathore","kct");
	}
	
}
