package estruturaDeDados;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MainStack {
    static void main() {

        // Array
        //size fixo, tem que ser definido no momento da criação
        String[] nome = new String[3];
        nome[0] = "Joao";

        //Lista
        //dinamica o tamanho pode variar de acordo com a quantidade adicionada
        List<String> nome2 = new ArrayList<>();
        nome2.add("Maria");


        //Stack
        //ultimo elemento que entrou e o primeiro a sair
        Stack<String> nome3 = new Stack<>();
        nome3.add("Pedro");
        System.out.println("Minha Stack: "+nome3);
        nome3.push("Lucas");
        System.out.println("Minha Stack: "+nome3);
        nome3.push("Carla");
        System.out.println("Minha Stack: "+nome3);
        nome3.pop();
        System.out.println("Minha Stack atualizada com pop: "+nome3);
        System.out.println("Minha Stack com o proximo no topo: "+nome3.peek());
        System.out.println("Tamanho da minha Stack: "+nome3.size());
        System.out.println("Minha Stack esta vazia? "+nome3.isEmpty());
        System.out.println("Minha Stack tem o elemento Lucas? "+nome3.contains("Lucas"));
    }

}
