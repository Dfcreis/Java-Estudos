package genericsSetMap.map;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;



public class MapEx002 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Map<String, Integer> votes = new LinkedHashMap<>();

        System.out.print("Please provide the file address: ");
        String path = input.next();

        try(BufferedReader br = new BufferedReader(new FileReader(path))){

            String line;
            while ((line = br.readLine()) != null) {
                String[] fields = line.split(",");
                String name = fields[0];
                Integer votos = Integer.parseInt(fields[1]);

                if(votes.containsKey(name)){
                    int  count = votes.get(name);
                    votes.put(name, votos+count);
                }else {
                    votes.put(name, votos);
                }
            }
            for(String key : votes.keySet()){
                System.out.println(key + ": " + votes.get(key));
            }


        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }


       input.close();
    }

}
