package genericsSetMap.modelEntidades;

import genericsSetMap.modelInterfaces.Ishape;

public class Circle implements Ishape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }



    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
