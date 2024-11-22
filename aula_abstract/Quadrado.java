package tads2.aula_abstract;
public class Quadrado extends Bidimensional {
    float lado;
    @Override
    public float getArea() {
        return lado*lado;
    }
    @Override
    public float getPerimetro() {
        return 4*lado;
    }
}
