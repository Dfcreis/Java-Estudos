package Arquivos.io.PathFiles;

import java.nio.file.Path;

public class PathAPP2 {
    public static void main(String[] args) {

        Path p1 = Path.of("home");
        Path p2 = Path.of("System");
        Path p3 = Path.of("arquivo.exe");

        Path p4 = p1.resolve(p2).resolve(p3);
        System.out.println("Path: "+p4);

        Path p5 = p1.toAbsolutePath();
        System.out.println("Path absolute: "+p5);
    }
}
