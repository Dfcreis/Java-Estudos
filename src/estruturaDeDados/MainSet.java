package estruturaDeDados;

import estruturaDeDados.model.User;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MainSet {
    static void main(String[] args) {

        Set<User> userSet = new HashSet<>();

        userSet.add(new User("Joao", 30));
        userSet.add(new User("Maria", 25));
        userSet.add(new User("Pedro", 35));
        userSet.add(new User("Joao", 30)); // Duplicado, não será adicionado

        System.out.println("Minha Set: " + userSet);




    }
}
