package estruturaDeDados;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MainSet {
    static void main(String[] args) {

        List<String> user = new ArrayList<>();

        user.add("Bruna");
        user.add("Amanda");
        user.add("Carla");
        user.add("Amanda"); // Duplicado, não será adicionado

        System.out.println("Minha Lista: " + user);

        Set<String> meuSet = new HashSet<>();
        meuSet.addAll(user);

        System.out.println("Minha Set: " + meuSet);

    }
}
