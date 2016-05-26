package com.demo.heytaxi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.demo.heytaxi.model.dao.UserDAO;
import com.demo.heytaxi.model.entity.User;
import com.demo.heytaxi.service.DriverService;

public class DriverServiceImpl implements DriverService{
	@Autowired
	UserDAO userDao;
	
	@Override
	public List<User> list() {
		return userDao.list();
	}

	@Override
	public User get(Long id) {
		return userDao.get(id);
	}

	@Override
	public void saveOrUpdate(User user) {
		userDao.saveOrUpdate(user);
		
	}

	@Override
	public void delete(Long id) {
		userDao.delete(id);
		
	}

}
