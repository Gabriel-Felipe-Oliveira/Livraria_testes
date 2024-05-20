package com.example.demo.models;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros;

    public Biblioteca() {
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void removerLivro(String isbn) {
        livros.removeIf(livro -> livro.getIsbn().equals(isbn));
    }

    public List<Livro> listarLivros() {
        return new ArrayList<>(livros);
    }
}
