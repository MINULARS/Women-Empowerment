package com.mini.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mini.repository.UserRepository;
import com.mini.repository.UserRepositoryImpl;
import com.mini.entity.NGO;
import com.mini.entity.ResponseDTO;
import com.mini.entity.ResponseType;
import com.mini.entity.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Transactional
	public void add(User user) {
		userRepository.addUser(user);
	}

	public User fetch(int id) {
		return userRepository.fetchUser(id);
	}

	@Transactional
	public User verifyUser(User login) {
		String username = login.getUsername();
		
		String password = login.getPassword();
		boolean flag = false;
		List<User> list = userRepository.fetchAll();
		for (User x : list) {
			System.out.println(x.getUsername());
			if (username.equals(x.getUsername()) && password.equals(x.getPassword()))
				return x;
		}
		return null;
	}

	@Transactional

	public ResponseDTO confirmLogin(User login) {
		ResponseDTO responseDTO = new ResponseDTO();
		try {
			User usr = userRepository.fetchUser(login);
			if (usr.getUsername().equals(login.getUsername()) && usr.getPassword().equals(login.getPassword())) {
				responseDTO.setResponseType(ResponseType.VERIFIED);
				responseDTO.setUsername(usr.getUsername());
				System.out.println("inside if");
				System.out.println(responseDTO.getUsername());
				return responseDTO;
			}

			responseDTO.setResponseType(ResponseType.NOTVERIFIED);
			return responseDTO;
		} catch (Exception e) {
			e.printStackTrace();
			responseDTO.setResponseType(ResponseType.ERROR);
			return responseDTO;
		}
	}

	@Override
	public List<User> fetchEach() {
		return userRepository.fetchAll();

	}
}
