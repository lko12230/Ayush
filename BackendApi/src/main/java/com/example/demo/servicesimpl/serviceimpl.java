package com.example.demo.servicesimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.dao.daolayer;
import com.example.demo.entities.User;
import com.example.demo.payloads.UserDto;
import com.example.demo.services.servicelayer;

public class serviceimpl implements servicelayer {

	@Autowired
	private daolayer daolayer;
	
	@Override
	public UserDto createUser(UserDto userDto) {
		User user=this.DtoToUser(userDto);
		User saveduser=daolayer.save(user);
		return this.UserToDto(saveduser);
	}

	@Override
	public UserDto updateUser(UserDto userDto, Integer userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDto getUserById(Integer userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserDto> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUser(Integer userId) {
		// TODO Auto-generated method stub

	}
	
	private User DtoToUser(UserDto userDto)
	{
		User user=new User();
		user.setName(userDto.getName());
		user.setEmail(userDto.getEmail());
		user.setPassword(userDto.getPassword());
		user.setAbout(userDto.getAbout());
		return user;
	}
	
	private UserDto UserToDto(User user)
	{
		UserDto userDto=new UserDto();
		userDto.setName(user.getName());
		userDto.setEmail(user.getEmail());
		userDto.setPassword(user.getPassword());
		userDto.setAbout(user.getAbout());
		return userDto;
	}

}
