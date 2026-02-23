package Funcional.util;

import Funcional.entidades.EntiPredicate;

import java.util.function.Predicate;

public class ProductPredicate implements Predicate<EntiPredicate> {

    @Override
    public boolean test(EntiPredicate e) {
        return e.getPrice()>=100;
    }
}
