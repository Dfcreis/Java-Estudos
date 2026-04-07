package estruturaDeDados;

import java.util.LinkedList;
import java.util.Queue;

public class MainQueue {
    static void main() {

         // Queue
        // primeiro elemento que entrou e o primeiro a sair
        Queue<String> nome = new LinkedList<>();
        nome.add("Joao");
        nome.add("Maria");
        nome.add("Pedro");
        System.out.println("Minha Queue: "+nome);
        nome.poll();
        System.out.println("Minha Queue atualizada com poll: "+nome);
        nome.offer("Lucas");
        System.out.println("Minha Queue atualizada com offer: "+nome);
        System.out.println("Minha Queue com o proximo no topo: "+nome.peek());
        System.out.println("Tamanho da minha Queue: "+nome.size());

    }
}
