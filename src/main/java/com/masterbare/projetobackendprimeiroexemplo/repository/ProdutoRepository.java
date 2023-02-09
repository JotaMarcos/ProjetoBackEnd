package com.masterbare.projetobackendprimeiroexemplo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;

import com.masterbare.projetobackendprimeiroexemplo.model.Produto;

//@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    
}
