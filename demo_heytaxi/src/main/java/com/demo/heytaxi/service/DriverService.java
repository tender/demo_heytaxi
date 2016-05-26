package com.demo.heytaxi.service;

import java.util.List;

import com.demo.heytaxi.model.entity.User;

public interface DriverService {
	public List<User> list();
    
    public User get(Long id);
     
    public void saveOrUpdate(User user);
     
    public void delete(Long id);
}
