package br.com.laviquedias.api_todo_list.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.laviquedias.api_todo_list.entities.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long>{

}
