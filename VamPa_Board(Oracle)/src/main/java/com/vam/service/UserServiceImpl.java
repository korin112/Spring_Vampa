package com.vam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vam.mapper.UserMapper;
import com.vam.model.UserDTO;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper mapper;
	
	@Override
	public void join(UserDTO user) {
		mapper.join(user);
		
	}

	@Override
	public UserDTO login(UserDTO user) {
		UserDTO loginUser = mapper.login(user);
		return loginUser;
	}

	@Override
	public List<UserDTO> getList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDTO getDetail(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int modify(UserDTO user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int bno) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public int idCheck(String id) {
		int result = mapper.idCheck(id);
		return result;
	}

}
