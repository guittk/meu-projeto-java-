package com.example.domain;

import java.time.LocalDate;

public class Filme {
    private String nome;
    private String diretor;
    private LocalDate dataLancamento;

    public Filme(String nome, String diretor, LocalDate dataLancamento) {
        this.nome = nome;
        this.diretor = diretor;
        this.dataLancamento = dataLancamento;
    }

    public String getNome() {
        return nome;
    }

    public String getDiretor() {
        return diretor;
    }

    public LocalDate getDataLancamento() {
        return dataLancamento;
    }
}
