package stream;

import java.util.ArrayList;
import java.util.List;

public class MainSteam {
    static void main(String[] args) {
        List<UserSteam> users = new ArrayList<>();

        users.add(new UserSteam("Alice", 30, "New York"));
        users.add(new UserSteam("Bob", 25, "Los Angeles"));
        users.add(new UserSteam("Charlie", 35, "Chicago"));
        users.add(new UserSteam("Daniel", 22, "Toronto"));
        users.add(new UserSteam("goku", 24, "tokyo"));
        users.add(new UserSteam("marcos", 45, "Chicago"));

        System.out.println();
        System.out.println("-----------------------------");
        // .stream
        //filtragem
        users.stream().filter(user -> user.getCity().equals("Chicago"))
                .forEach(System.out::println); //soutc

        System.out.println();
        System.out.println("-----------------------------");

        //Ordenacao
        users.stream()
                .sorted((n1, n2)-> n1.getName().compareTo(n2.getName()))
                .forEach(System.out::println);
        System.out.println();
        System.out.println("-----------------------------");

        //mapear
        users.stream()
                .map(UserSteam::getName)
                .forEach(System.out::println);
    }
}
