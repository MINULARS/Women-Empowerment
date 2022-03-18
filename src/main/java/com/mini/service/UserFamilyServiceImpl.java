package com.mini.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mini.entity.UserFamilyDetails;

import com.mini.repository.UserFamilyRepository;

@Service
public class UserFamilyServiceImpl implements UserFamilyService {

	@Autowired
	private UserFamilyRepository userFamilyRepository;

	@Transactional
	public void add(UserFamilyDetails ufd) {
		userFamilyRepository.addUserFamilyDetails(ufd);
	}

	public List<UserFamilyDetails> fetchEach() {
		return userFamilyRepository.fetchAll();

	}

}
