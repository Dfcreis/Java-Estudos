package Arquivos.io.PathFiles;

import java.nio.file.Files;
import java.nio.file.Path;

public class FileApp1 {
    public static void main(String[] args) {
        Path p1 = Path.of("Exemples", "File.txt");
        System.out.println(Files.exists(p1)+"\n"+p1.toAbsolutePath());
        System.out.println("e um diretorio: "+Files.isDirectory(p1));
        System.out.println("e um arquivo :"+Files.isRegularFile(p1));

    }
}
