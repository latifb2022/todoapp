package com.lbenzzine.todoapp.dao;

import com.lbenzzine.todoapp.model.Creds;

public interface ILoginDAO {
	public boolean validate(Creds creds) throws ClassNotFoundException;
}
