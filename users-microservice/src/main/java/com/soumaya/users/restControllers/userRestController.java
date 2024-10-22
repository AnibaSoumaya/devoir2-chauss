package com.soumaya.users.restControllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.soumaya.users.entities.user;
import com.soumaya.users.service.userService;

@RestController
@CrossOrigin(origins = "*")
public class userRestController {

	@Autowired
	userService userService;
	@GetMapping("all")
	public List<user> getAllUsers() {
	return userService.findAllUsers();
	}
}
