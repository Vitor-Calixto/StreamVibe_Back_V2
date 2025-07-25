package com.streamvibe.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.streamvibe.api.models.filme.DadosCadastroFilme;
import com.streamvibe.api.models.filme.Filme;
import com.streamvibe.api.models.filme.FilmeRepository;

import jakarta.transaction.Transactional;

@RestController
@RequestMapping("/filme")
public class FilmesController {

    // Injeção de depedência
    @Autowired
    private FilmeRepository repository;
    
    @PostMapping
    @Transactional
    public void cadastrarFilme(@RequestBody DadosCadastroFilme dados) {
        repository.save(new Filme(dados));
    }

    // Aqui fica o READ
    @GetMapping
    public List<Filme> listarFilmes() {
        return repository.findAll();
    }



    // Aqui fica o UPDATE
    @PutMapping
    @Transactional
    public void atualizarFilme(@RequestBody Filme filme ){
        // var filme = repository.findById(filme.id());
    }

    // Aqui fica o DELETE real
    // @DeleteMapping("/{id}")
    // @Transactional
    // public void excluirFilmeReal(@PathVariable Integer id) {
    //     repository.deleteById(id);
    // }

    // Aqui fica a Exclusão Lógica
    @DeleteMapping("/{id}")
    @Transactional
    public void excluirFilmeLogico(@PathVariable Integer id) {
       var filme = repository.getReferenceById(id);
       filme.exclusaoLogica();
    }


}