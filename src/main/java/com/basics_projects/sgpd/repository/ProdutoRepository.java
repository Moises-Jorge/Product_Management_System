package com.basics_projects.sgpd.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.basics_projects.sgpd.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
    
}
