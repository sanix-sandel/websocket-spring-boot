package com.sanix.todoWebsocket.repository;

import com.sanix.todoWebsocket.model.ToDo;
import org.springframework.data.repository.CrudRepository;

public interface ToDoRepository extends CrudRepository<ToDo, String> {
}
