package com.awasur.todo.service;

import com.awasur.todo.data.ToDo;
import com.awasur.todo.exception.EntityNotFoundException;
import com.awasur.todo.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //DECLARES THIS AS A SERVICE
public class ToDoService {
    @Autowired //SPRING MAKES SURE IT HAS AN INSTANCE AT RUNTIME
    private ToDoRepository toDoRepository;

    public List<ToDo> findAll() {
        return toDoRepository.findAll();
    }

    public ToDo findById(String id) {
        return toDoRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    public ToDo save(ToDo toDo) {
        return toDoRepository.save(toDo);
    }

    public void deleteById(String id) {
        toDoRepository.deleteById(id);
    }
}
