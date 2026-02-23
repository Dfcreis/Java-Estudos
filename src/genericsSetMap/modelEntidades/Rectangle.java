package genericsSetMap.modelEntidades;

import genericsSetMap.modelInterfaces.Ishape;

public class Rectangle implements Ishape {
    private Double base;
    private Double altura;

    public Rectangle(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Double getBase() {
        return base;
    }
    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }
    public void setAltura(Double altura) {
        this.altura = altura;
    }


    @Override
    public double calcularArea() {
        return base * altura;
    }

}
