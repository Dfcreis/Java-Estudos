package genericsSetMap.map;

import java.util.Map;
import java.util.TreeMap;

public class AtvMap {
    public static void main(String[] args) {

        Map<String,String> cookies = new TreeMap<>();

        cookies.put("username","maria");
        cookies.put("email","maria@gmail.com");
        cookies.put("phone","998877665");

        cookies.remove("email");
        cookies.put("phone","998877776");

        System.out.println("Contains 'phone' key: "+cookies.containsKey("phone"));
        System.out.println("Phone number: "+cookies.get("phone"));
        System.out.println("Email : "+cookies.get("email") );
        System.out.println("Size: "+cookies.size());

        System.out.println("All cookies: ");
        for(String key : cookies.keySet()){
            System.out.println(key + ": " + cookies.get(key));
        }








    }
}
