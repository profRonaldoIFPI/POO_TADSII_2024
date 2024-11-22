package tads2.aula_abstract;
public class Aula_Abstract {
    public static void main(String[] args) {
        Quadrado q = new Quadrado();
        q.lado = 3;
        Retangulo r = new Retangulo();
        r.lado1 = 5;
        r.lado2 = 6;
        Circulo c = new Circulo();
        c.raio = 4;
//        areaBidimensional(q);
//        areaBidimensional(r);
//        areaBidimensional(c);
        Bidimensional[] formas = new Bidimensional[3];
        formas[0] = q;
        formas[1] = r;
        formas[2] = c;
 //generalizando os objetos das subclasses como sendo da superclasse
        for(Bidimensional forma : formas ){ 
            areaBidimensional(forma);
        }
    }
 //generalizando os objetos das subclasses como sendo da superclasse
    public static void areaBidimensional(Bidimensional objeto){
        if(objeto instanceof Quadrado quadrado){
            System.out.print("A area do quadrado e ");
            System.out.println(quadrado.getArea());
        }
        if (objeto instanceof Retangulo){
            System.out.print("A area do retangulo e ");
            Retangulo o = (Retangulo) objeto; //casting ou coerção
            System.out.println(o.getArea());
        }
        if (objeto instanceof Circulo){
            System.out.print("A area do circulo e ");
            Circulo o = (Circulo) objeto; //casting ou coerção
            System.out.println(o.getArea());
        }
    }
}