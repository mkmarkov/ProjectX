package com.example.demo.fake;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Fake {
	
	@RequestMapping("/Fake")
	public List<FUsers> AllUsers() {
		return Arrays.asList(
				new FUsers(1,"Martin"),
				new FUsers(2,"Bozhidar"),
				new FUsers(3,"Tencho")
				);
	}

}
