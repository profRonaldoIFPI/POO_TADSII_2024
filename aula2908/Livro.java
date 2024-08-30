package com.mycompany.aula2908;
public class Livro {
    //atributos
    String titulo;
    String autor;
    int paginas;
    //método
    public Livro(String title, String author, int nPag){
        this.titulo = title;
        this.autor = author;
        this.paginas = nPag;
    }
    void descricao(){
        System.out.println(
                "Titulo: "+this.titulo+
                ", Autor: "+this.autor+
                ", Paginas: "+this.paginas
        );
    }
}
