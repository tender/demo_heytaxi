package com.demo.heytaxi.model.dao;

import java.util.List;

import com.demo.heytaxi.model.entity.User;

public interface UserDAO {
	public List<User> list();
    
    public User get(Long id);
     
    public void saveOrUpdate(User user);
     
    public void delete(Long id);
}
