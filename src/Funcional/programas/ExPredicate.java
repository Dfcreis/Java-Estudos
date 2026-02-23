package Funcional.programas;

import Funcional.entidades.EntiPredicate;
import Funcional.util.ProductPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

public class ExPredicate {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        List<EntiPredicate>lista = new ArrayList<>();
        lista.add(new EntiPredicate("Tv",900.0));
        lista.add(new EntiPredicate("Mouse",50.0));
        lista.add(new EntiPredicate("Tablet",350.0));
        lista.add(new EntiPredicate("Hd case",85.0));

        //lista.removeIf(x -> x.getPrice()>=100.0);

                //Expressao lambda declarada
        //Predicate<EntiPredicate> pred = p -> p.getPrice() >= 100.0;

        lista.removeIf(p -> p.getPrice() >= 100.0);

        for(EntiPredicate p: lista){
            System.out.println(p);
        }



    }
}
