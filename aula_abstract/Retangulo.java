package tads2.aula_abstract;
public class Retangulo extends Bidimensional{
    float lado1, lado2;
    @Override
    public float getArea() {
        return lado1*lado2;
    }

    @Override
    public float getPerimetro() {
        return 2*lado1 + 2*lado2;
    }
    
}
