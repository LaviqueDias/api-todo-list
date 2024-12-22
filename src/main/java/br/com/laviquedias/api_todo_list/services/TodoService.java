package br.com.laviquedias.api_todo_list.services;

import java.util.HashSet;
import java.util.Set;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.com.laviquedias.api_todo_list.entities.Todo;
import br.com.laviquedias.api_todo_list.repositories.TodoRepository;

@Service
public class TodoService {

    private TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    

    public Set<Todo> create(Todo todo){
        todoRepository.save(todo);

        return list();
    }


    public Set<Todo> list(){

        Set<Todo> todos = new HashSet<>();

        for (Todo todo : todoRepository.findAll()) {
            todos.add(todo);
        }

        return todos;

    }


    public Set<Todo> update(Todo todo){
        todoRepository.save(todo);

        return list();
    }


    public Set<Todo> delete(Long id_todo){
        todoRepository.deleteById(id_todo);

        return list();
    }

}
