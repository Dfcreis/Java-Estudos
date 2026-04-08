package bigO;

import java.util.ArrayList;
import java.util.LinkedList;

public class ConplexidadeAlgoritimo {
    static void main(String[] args) {

        long inicio;
        long fim;
        long tempo;

        LinkedList<Integer> linkedList = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 100; i++){
            linkedList.add(i);
            arrayList.add(i);
        }

        //LinkedList
        inicio = System.nanoTime();
        linkedList.get(50);
        fim = System.nanoTime();
        tempo = fim - inicio;
        System.out.println("Tempo gasto para acessar o elemento 50 na LinkedList: "+tempo+" nanosegundos");

        //arrayList
        inicio = System.nanoTime();
        arrayList.get(50);
        fim = System.nanoTime();
        tempo = fim - inicio;
        System.out.println("Tempo gasto para acessar o elemento 50 na ArrayList: "+tempo+" nanosegundos");




    }
}
