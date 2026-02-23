package genericsSetMap.generics;

import java.util.Arrays;
import java.util.List;

public class Curinga {
    public static void main(String[] args) {
       List<Integer> lista = Arrays.asList(5 ,2 ,10);
       printLists(lista);

    }
    public static void printLists(List<?> lista) {
        for (Object o : lista) {
            System.out.print(o+" ");
        }

    }
}
