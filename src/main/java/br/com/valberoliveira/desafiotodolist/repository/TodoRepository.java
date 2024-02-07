package br.com.valberoliveira.desafiotodolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.valberoliveira.desafiotodolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
