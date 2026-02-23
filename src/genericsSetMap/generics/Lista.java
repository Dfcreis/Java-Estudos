package generics.modelProgramas;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lista {
    public static void main(String[] args) {
       List<Integer> myLista = new ArrayList<>();
        printLista(myLista);

    }
    public static void printLista(List<?> lista){
      for (Object o : lista){
          System.out.println(o);
      }
    }
}
