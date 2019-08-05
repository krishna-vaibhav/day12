package com.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojos.User;

@RestController
@RequestMapping("/users")
public class TestController {
	@GetMapping("/{num}")
	public List<User> fetchUsers(@PathVariable int num) {
		List<User> users = new ArrayList<>();
		for (int i = 1; i <= num; i++)
			users.add(new User(i, "abc" + i, 1000 * i));
		System.out.println("server : "+users);
		return users;
	}

}
