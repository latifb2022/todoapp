package com.lbenzzine.todoapp.dao;

import com.lbenzzine.todoapp.model.User;

public interface IUserDAO {
	public int registerEmployee(User employee) throws ClassNotFoundException;
}
