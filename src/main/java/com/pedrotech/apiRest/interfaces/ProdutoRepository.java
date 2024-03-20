package com.pedrotech.apiRest.interfaces;

import com.pedrotech.apiRest.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
