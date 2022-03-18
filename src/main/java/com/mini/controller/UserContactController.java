package com.mini.controller;

import org.springframework.beans.factory.annotation.Autowired;
import java.lang.Double;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mini.entity.UserContactDetails;
import com.mini.service.UserContactService;

@RestController
@CrossOrigin
public class UserContactController {

	@Autowired
	private UserContactService userContactService;

	@RequestMapping(path = "/userContact/add", method = RequestMethod.POST)
	public String add(@RequestBody UserContactDetails ucd) {
		userContactService.add(ucd);
		return "{\"status\" : \"User Contact  Details  Added Successfully!\"}";
	}

	@RequestMapping(path = "/userContact/fetch", method = RequestMethod.GET)
	public List<UserContactDetails> fetchAll() {
		List<UserContactDetails> list = userContactService.fetchEach();
		return list;
	}
}
