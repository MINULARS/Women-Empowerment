package com.mini.repository;

import java.util.List;

import com.mini.entity.UserContactDetails;

public interface UserContactRepository {
	public void addUserContact(UserContactDetails ucd);

	public List<UserContactDetails> fetchAll();
}
