package com.mkyong.form.dao;

import java.util.List;

import com.mkyong.form.model.User;

public interface UserDao {

	User findById(Integer id);

	List<User> findAll();

	void save(User user);

	void update(User user);

	void delete(Integer id);
	//lista de metodos de impl
	//y probando la sincronizacion

}