package com.pedrotech.apiRest.controller;

import com.pedrotech.apiRest.interfaces.ProdutoRepository;
import com.pedrotech.apiRest.model.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    ProdutoRepository produtoRepository;

    @GetMapping
    public List<Produto> listar() {
        return produtoRepository.findAll();
    }

    @PostMapping
    public Produto adicionar(@RequestBody Produto produto) {
        return produtoRepository.save(produto);
    }

    @DeleteMapping(value = "/{id}")
    public void apagar(@PathVariable(value = "id") Long produtoId) {
        produtoRepository.deleteById(produtoId);
    }
}
