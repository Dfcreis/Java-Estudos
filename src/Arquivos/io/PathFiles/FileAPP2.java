package Arquivos.io.PathFiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileAPP2 {
    public static void main(String[] args) throws IOException {

        Path root = Path.of("Exemples");
        Path d1 = root.resolve("D1");

        if (!Files.exists(d1)) {
            Files.createDirectory(root.resolve("D1"));
        }
        Path d2 = Files.createDirectories(d1.resolve(Path.of("D2", "D3")));
        Files.createFile(d2.resolve(Path.of("D3")));
        Files.createFile(d2.getParent().resolve(Path.of("D2")));
        Files.createFile(d2.getParent().getParent().resolve(Path.of("D1")));

    }
}
