package genericsSetMap.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CuringaDelimitado {
    public static void main(String[] args) {
        List<Integer> inteiros = Arrays.asList(1,2,3,4);
        List<Double> reais = Arrays.asList(3.14,6.28);
        List<Object> obj = new ArrayList<>();

        copy(inteiros,obj);
        print(obj);
        copy(reais,obj);
        print(obj);
    }
    public static void copy(List<? extends Number> src,List<? super Number> dest){
        for (Number n : src) {
            dest.add(n);
        }
    }
    public static void print(List<?> list ){
        for (Object o : list){
            System.out.print(o + " ");
        }
        System.out.println();
    }






}
