package com.teste.integracaodois.repo;


import com.teste.integracaodois.modelo.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repositorys extends JpaRepository<Pessoa, Long> {

    Pessoa findPessoaById(Long id);

}
