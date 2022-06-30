package com.lbenzzine.todoapp.dao;

import java.sql.SQLException;
import java.util.List;

import com.lbenzzine.todoapp.model.Todo;

public interface ITodoDAO {

	void insertTodo(Todo todo) throws SQLException;

	Todo selectTodo(long todoId);

	List<Todo> selectAllTodos();

	boolean deleteTodo(int id) throws SQLException;

	boolean updateTodo(Todo todo) throws SQLException;

}