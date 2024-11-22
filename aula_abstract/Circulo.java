package tads2.aula_abstract;
public class Circulo extends Bidimensional{
    float raio;
    @Override
    public float getArea() {
        return (float)(Math.PI * Math.pow(raio, 2)); 
    }
    @Override
    public float getPerimetro() {
        return (float)(2*Math.PI * raio);
    }
    //casting ou coerção porque Math.PI é double
}
