package com.mycompany.aula0509;
import java.util.ArrayList;
import java.util.List;

public class Aula0509 {
    public static void main(String[] args) {
        Loja minhaLoja = new Loja("bugingangas.com", "rua x");
        Produto produto1 = new Produto("Caixa JBL", 80);
             
        minhaLoja.adicionar_produto(produto1);
        minhaLoja.adicionar_produto(new Produto("iWatch", 100));
        minhaLoja.adicionar_produto(new Produto("Copo Stanley", 30));
        
        minhaLoja.listar_produtos();
        minhaLoja.vender_produto("iWatch");
        
        minhaLoja.listar_produtos();
    }
}
