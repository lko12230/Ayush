package com.example.demo.services;

import java.util.List;

import com.example.demo.payloads.UserDto;

public interface servicelayer {
	UserDto createUser(UserDto userDto);
	UserDto updateUser(UserDto userDto,Integer userId);
	UserDto getUserById(Integer userId);
	List<UserDto> getAllUsers();
	void deleteUser(Integer userId);
}
