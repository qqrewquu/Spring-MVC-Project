package com.appsdeveloperblog.app.ws.ui.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.appsdeveloperblog.app.ws.service.UserService;
import com.appsdeveloperblog.app.ws.shared.dto.UserDto;
import com.appsdeveloperblog.app.ws.ui.model.request.UserDetailsRequestModel;
import com.appsdeveloperblog.app.ws.ui.model.response.UserRest;

@RestController
@RequestMapping("users") // http://localhost:8080/users
public class UserController {
	
	// assign bean to userService object?
	@Autowired
	UserService userService;
	
	@GetMapping
	public String getUser() {
		return "get user was called";
		
	}
	
	@PostMapping
	public UserRest createUser(@RequestBody UserDetailsRequestModel userDetails) {
		
		// initialize response object that contains user information back to clien t
		UserRest returnValue = new UserRest();
		
		
		//create data transfer object
		UserDto userDto = new UserDto();
		
		//copy userDetails object to dto
		BeanUtils.copyProperties(userDetails, userDto);
		
		
		// created the user info which is an response back to client
		UserDto createdUser = userService.createUser(userDto);
		
		// copy the created user info to response object
		BeanUtils.copyProperties(createdUser, returnValue);
			
		return returnValue;
		
	}
	
	@PutMapping
	public String updateUser() {
		return "update user was called";
		
	}
	
	@DeleteMapping
	public String deleteUser() {
		return "delete user was called";
		
	}	
	
	
	

}
