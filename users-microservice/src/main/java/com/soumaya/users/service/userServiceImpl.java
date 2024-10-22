package com.soumaya.users.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.soumaya.users.entities.role;
import com.soumaya.users.entities.user;
import com.soumaya.users.repos.roleRepository;
import com.soumaya.users.repos.userRepository;

@Transactional
@Service
public class userServiceImpl implements userService{

	@Autowired
	userRepository userRep;
	@Autowired
	roleRepository roleRep;
	@Autowired
	BCryptPasswordEncoder bCryptPasswordEncoder;
	@Override
	public user saveUser(user user) {
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		return userRep.save(user);
	}
	@Override
	public user addRoleToUser(String username, String rolename) {
		user usr = userRep.findByUsername(username);
		role r = roleRep.findByRole(rolename);
		usr.getRoles().add(r);
		return usr;
	}
	@Override
	public role addRole(role role) {
		return roleRep.save(role);
	}
	@Override
	public user findUserByUsername(String username) {
		return userRep.findByUsername(username);
	}
	
	@Override
	public List<user> findAllUsers() {
	return userRep.findAll();
	}
}
