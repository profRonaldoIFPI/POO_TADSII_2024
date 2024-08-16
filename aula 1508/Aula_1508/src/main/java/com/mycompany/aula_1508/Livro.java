package com.mycompany.aula_1508;
public class Livro {
    String titulo;
    String autor;
    int ano;
    String editora;
    String genero;
    String isbn;
    Livro(String titulo, String autor, int ano, String editora, String genero, String isbn){//método construtor
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.editora = editora;
        this.genero = genero;
        this.isbn = isbn;
    }
}
