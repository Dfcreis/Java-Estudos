package packinterface.modelComparable;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Icomparable {
    public static void main(String[] args) {

    List<Funcionario> list = new ArrayList<>();

    String path ="C:\\out\\in.txt";

    try(BufferedReader br = new BufferedReader(new FileReader(path))){

        String name = br.readLine();

        while(name!=null){
            String[] fields = name.split(",");

            list.add(new Funcionario(fields[0],Double.parseDouble(fields[1])));

            name = br.readLine();
        }

        Collections.sort(list);

        for(Funcionario emp : list){
            System.out.println(emp.getNome()+", "+emp.getSalario());
        }

    } catch (IOException e) {
        throw new RuntimeException(e.getMessage());
    }
    }
}
