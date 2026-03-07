package com.example.service;

import com.example.domain.Filme;
import java.util.ArrayList;
import java.util.List;

public class FilmeService {
    private List<Filme> filmes = new ArrayList<>();

    public void adicionar(Filme filme) {
        filmes.add(filme);
    }

    public List<Filme> listar() {
        return new ArrayList<>(filmes);
    }

    public void deletar(String nome) {
        filmes.removeIf(f -> f.getNome().equalsIgnoreCase(nome));
    }

    public Filme listarDetalhes(String nome) {
        return filmes.stream()
                .filter(f -> f.getNome().equalsIgnoreCase(nome))
                .findFirst()
                .orElse(null);
    }
}
