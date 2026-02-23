package Arquivos.io.PathFiles;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileAPP4 {
    public static void main(String[] args) throws IOException {

        Path arquivo = Paths.get("arquivo.txt");
        //Files.createFile(arquivo);
        Files.deleteIfExists(arquivo);











    }
}
