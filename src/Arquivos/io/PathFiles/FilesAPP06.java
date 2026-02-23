package Arquivos.io.PathFiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesAPP06 {
    public static void main(String[] args) throws IOException {

       try(var files = Files.newDirectoryStream(Path.of(""))){
           for(Path path : files){
               System.out.println(path);
           }
       }

    }
}
