package com.example.basicExample;

import java.util.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class basicController {
	
	@GetMapping(value="/products/getAll")
	public List<String> getAllMethod(){
		List<String> newList = new ArrayList<>();
		newList.add("ReactJS");
		newList.add("Python");
		newList.add("Java");
		return newList;
	}
}
