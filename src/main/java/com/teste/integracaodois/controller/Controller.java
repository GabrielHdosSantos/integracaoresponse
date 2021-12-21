package com.teste.integracaodois.controller;

import com.teste.integracaodois.repo.Repositorys;
import com.teste.integracaodois.modelo.Pessoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class Controller {

    @Autowired
    private Repositorys repository;

    @PostMapping("/add")
    public ResponseEntity<Pessoa> add (@RequestBody Pessoa pessoa){
        Pessoa newPessoa = repository.save(pessoa);
        return new ResponseEntity<>(newPessoa, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<Pessoa> findById(@PathVariable("id") Long id){
        Pessoa find = repository.findPessoaById(id);
        return new ResponseEntity<>(find, HttpStatus.OK);
    }


}
