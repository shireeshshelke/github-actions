package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {
	
	@GetMapping("/get-todo")
	public Result getTodo() {
		return new Result("Success");
	}
	
	public static class Result {
		String name;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Result(String name) {
			super();
			this.name = name;
		}
		
	}
	
}	
