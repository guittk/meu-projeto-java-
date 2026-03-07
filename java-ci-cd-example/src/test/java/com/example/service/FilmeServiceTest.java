package com.example.service;

import com.example.domain.Filme;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.List;

public class FilmeServiceTest {

    private FilmeService service;

    @Before
    public void setup() {
        service = new FilmeService();
    }

    @Test
    public void deveAdicionarFilme() {
        Filme filme = new Filme("Matrix", "Wachowskis", LocalDate.of(1999, 3, 31));
        service.adicionar(filme);

        List<Filme> filmes = service.listar();
        Assert.assertEquals(1, filmes.size());
        Assert.assertEquals("Matrix", filmes.get(0).getNome());
    }

    @Test
    public void deveListarFilmes() {
        service.adicionar(new Filme("Matrix", "Wachowskis", LocalDate.of(1999, 3, 31)));
        service.adicionar(new Filme("Inception", "Nolan", LocalDate.of(2010, 7, 16)));

        List<Filme> filmes = service.listar();
        Assert.assertEquals(2, filmes.size());
    }

    @Test
    public void deveDeletarFilme() {
        service.adicionar(new Filme("Matrix", "Wachowskis", LocalDate.of(1999, 3, 31)));
        service.deletar("Matrix");

        List<Filme> filmes = service.listar();
        Assert.assertTrue(filmes.isEmpty());
    }

    @Test
    public void deveListarDetalhesDoFilme() {
        service.adicionar(new Filme("Matrix", "Wachowskis", LocalDate.of(1999, 3, 31)));

        Filme filme = service.listarDetalhes("Matrix");
        Assert.assertNotNull(filme);
        Assert.assertEquals("Matrix", filme.getNome());
        Assert.assertEquals("Wachowskis", filme.getDiretor());
        Assert.assertEquals(LocalDate.of(1999, 3, 31), filme.getDataLancamento());
    }
}
