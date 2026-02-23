package Arquivos.io.PathFiles;


import java.nio.file.Path;

public class pathApp {
    public static void main(String[] args) {

        // -> C:\System\java\arquivo.exe
        Path p = Path.of("C:","System","java","arquivo.exe");
        System.out.println("Path: "+p);

        Path p2 = p.getFileName();
        System.out.println("Name: "+p2);

        Path p3 = p.getRoot();
        System.out.println("Root: "+p3);


    }
}
