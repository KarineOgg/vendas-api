package com.vendas.domain.repositorio;

import com.vendas.domain.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;


public interface Clientes extends JpaRepository<Cliente, Integer > {
    List<Object> findByNomeLike(String nome);


}
