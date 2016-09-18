package com.inpowered.api.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonApi {
	@RequestMapping(method = RequestMethod.GET)
	public String sayHello(){
		return "Calls Person Api";
	}

}
