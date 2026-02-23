package genericsSetMap.generics;

import genericsSetMap.modelEntidades.Circle;
import genericsSetMap.modelEntidades.Rectangle;
import genericsSetMap.modelInterfaces.Ishape;

import java.util.ArrayList;
import java.util.List;


public class Formas {
    public static void main(String[] args) {

        List<Ishape> myShapes = new ArrayList<>();
        myShapes.add(new Rectangle(2.0,3.0));
        myShapes.add(new Circle(2.0));

        List<Circle> myCircles = new ArrayList<>();
        myCircles.add(new Circle(2.0));
        myCircles.add(new Circle(3.0));

        System.out.println("Total area: " + totalArea(myCircles));
    }

    public static double totalArea(List<? extends Ishape> list) {
        double sum = 0.0;
        for (Ishape s : list) {
            sum += s.calcularArea();
        }
        return sum;
    }
}