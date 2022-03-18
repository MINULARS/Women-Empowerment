package com.mini.repository;

import java.util.List;
import com.mini.entity.UserFamilyDetails;

public interface UserFamilyRepository {

	public void addUserFamilyDetails(UserFamilyDetails user);

	public List<UserFamilyDetails> fetchAll();

}

