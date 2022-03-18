package com.mini.service;

import java.util.List;

import com.mini.entity.UserContactDetails;

public interface UserContactService {
	public void add(UserContactDetails ucd);

	public List<UserContactDetails> fetchEach();

}
