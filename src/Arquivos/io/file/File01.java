package Arquivos.io.file;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class File01 {
    public static void main(String[] args) {
        File file = new File("C:\\temp\\in.txt");
        Scanner sc = null;
        try{
            sc = new Scanner(file);
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        }catch(IOException e){
            System.out.println(e);
        }finally {
            if(sc != null) {
                sc.close();
            }
        }
    }
}
