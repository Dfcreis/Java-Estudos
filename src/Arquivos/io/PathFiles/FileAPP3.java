package Arquivos.io.PathFiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileAPP3 {
    public static void main(String[] args) throws IOException {

        Path d1 = Files.createTempDirectory(Path.of(""), "app_");
        System.out.println("Diretorio temporario" + d1);
        Path d2 = Files.createTempFile(Path.of(""),"App_",null);
        System.out.println("Arquivo temporario" + d2);

    }
}
