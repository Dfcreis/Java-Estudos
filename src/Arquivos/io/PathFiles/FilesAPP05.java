package Arquivos.io.PathFiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class FilesAPP05  {
    public static void main(String[] args) throws IOException {

        Path caminho = Path.of("Exemples","files.txt");
       // Path destino = caminho.getParent().resolve("files2.txt");
        Path destino = caminho.getParent().resolve("Files","Files01.txt");
        System.out.println(destino.isAbsolute());

        Files.copy(caminho, destino,StandardCopyOption.REPLACE_EXISTING);
        Files.move(caminho, destino, StandardCopyOption.REPLACE_EXISTING);
    }
}
