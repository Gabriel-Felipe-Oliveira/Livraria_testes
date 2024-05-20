package com.example.demo;


import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.models.Biblioteca;
import com.example.demo.models.Livro;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", "978-0261102385");
        Livro livro2 = new Livro("1984", "George Orwell", "978-0451524935");

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);

        System.out.println("Lista de livros na biblioteca:");
        for (Livro livro : biblioteca.listarLivros()) {
            System.out.println(livro);
        }

        biblioteca.removerLivro("978-0451524935");

        System.out.println("\nLista de livros na biblioteca após remover 1984:");
        for (Livro livro : biblioteca.listarLivros()) {
            System.out.println(livro);
        }
    }

}
