package com.basics_projects.sgpd.service;

import java.util.List;

import com.basics_projects.sgpd.domain.Produto;

public interface ProdutoService {
    
    Produto buscarProduto(Long id);

    List<Produto> listarProdutos();

    Produto salvaProduto(Produto produto);

    void removerProduto(Long id);
}
