package com.mini.service;

import java.util.List;

import com.mini.entity.NGO;
import com.mini.entity.ResponseDTO;
import com.mini.entity.User;

public interface NGOService {

	public void add(NGO ngo);

	public NGO fetch(int id);

	public NGO verifyNgo(NGO login);

	public ResponseDTO confirmLogin(NGO ngo);

	public List<NGO> fetchEach();

}
