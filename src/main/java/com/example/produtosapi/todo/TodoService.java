package com.example.produtosapi.todo;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
    private TodoRepository repository;

    public TodoService(TodoRepository repository) {
        this.repository = repository;
    }

    public TodoEntity salvar(TodoEntity novoTodo){
       return repository.save(novoTodo);
    }
    public void atualizarStatus(TodoEntity novoTodo){
        repository.save(novoTodo);
    }

    public TodoEntity buscarPorId(Integer id){
        return repository.findById(id).orElse(null);
    }
}
