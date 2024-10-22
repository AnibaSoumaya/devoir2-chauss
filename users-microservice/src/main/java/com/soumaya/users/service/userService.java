package com.soumaya.users.service;

import java.util.List;

import com.soumaya.users.entities.role;
import com.soumaya.users.entities.user;

public interface userService {

	user saveUser(user user);
	user findUserByUsername (String username);
	role addRole(role role);
	user addRoleToUser(String username, String rolename);
	List<user> findAllUsers();
}
