package com.mycompany.aula_1508;
public class LivroDeLivraria extends Livro{
    double preco;
    int codigo;
    String secao;
    public LivroDeLivraria(String titulo, String autor, int ano, String editora, String genero, String isbn) {
        super(titulo, autor, ano, editora, genero, isbn);
    }
}
