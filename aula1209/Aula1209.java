package aula1209;

import java.time.LocalDate;

public class Aula1209 {
    public static void main(String[] args) {
        Pessoa p = new Pessoa(
                "Ronaldo",
                "11122233344",
                "ronaldo.pb@ifpi.edu.br",
                "89994129138",
                LocalDate.of(1981, 12, 30)
            );
        System.out.println(p.getTelefone());
        p.setTelefone("89994121107");
        System.out.println(p.getTelefone());
        p.setTelefone("89 94121107");
        System.out.println(p.getTelefone());
        
        
    }
}
