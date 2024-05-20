package com.example.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

import com.example.demo.models.Biblioteca;
import com.example.demo.models.Livro;

class BibliotecaTest {
    private Biblioteca biblioteca;
    private Livro livro1;
    private Livro livro2;

    @BeforeEach
    void setUp() {
        biblioteca = new Biblioteca();
        livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", "978-0261102385");
        livro2 = new Livro("1984", "George Orwell", "978-0451524935");
    }

    @Test
    void testAdicionarLivro() {
        biblioteca.adicionarLivro(livro1);
        List<Livro> livros = biblioteca.listarLivros();
        assertEquals(1, livros.size());
        assertTrue(livros.contains(livro1));
    }

    @Test
    void testRemoverLivro() {
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.removerLivro("978-0451524935");
        List<Livro> livros = biblioteca.listarLivros();
        assertEquals(1, livros.size());
        assertFalse(livros.contains(livro2));
        assertTrue(livros.contains(livro1));
    }

    @Test
    void testListarLivros() {
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        List<Livro> livros = biblioteca.listarLivros();
        assertEquals(2, livros.size());
        assertTrue(livros.contains(livro1));
        assertTrue(livros.contains(livro2));
    }
}
