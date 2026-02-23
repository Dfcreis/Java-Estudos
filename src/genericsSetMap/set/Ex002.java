package genericsSetMap.set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Ex002 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        Set<Integer> c = new HashSet<>();

        System.out.print("How many students for course A? ");
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
           int num = input.nextInt();
           a.add(num);
        }
        System.out.print("How many students for course B? ");
        n = input.nextInt();
        for (int i = 0; i < n; i++) {
            int num = input.nextInt();
            b.add(num);
        }
        System.out.print("How many students for course C? ");
        n = input.nextInt();
        for (int i = 0; i < n; i++) {
            int num = input.nextInt();
            c.add(num);
        }

        Set<Integer> total = new HashSet<>(a);
        total.addAll(b);
        total.addAll(c);

        System.out.println("Total students: " +total.size());






        input.close();
    }
}
