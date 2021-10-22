package by.overone.lesson19;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
      /*  Map<String,String> map =new HashMap<>();

        map.put("3","igor");
        map.put("1","vas");
        map.put("2","kol");

        map.put("4","igor");

        System.out.println(map);

        map.put("4", "Katya");
        map.put("5","igor");
        System.out.println(map);
        System.out.println("_______");
        System.out.println(map.get("2"));
        System.out.println(map.containsValue("igor"));
        System.out.println(map.entrySet());

        for (Map.Entry<String,String> entry: map.entrySet()) {
            System.out.println("Hello " + entry.getValue());
        }

        System.out.println(map.replace("4","Igor","Ekaterina"));
        System.out.println(map);

*/

        /*Map<Integer,Storage> storageMap=new HashMap<>();
        storageMap.put(1,new Storage(100,"Molochka",20));
        storageMap.put(2,new Storage(50,"NeMolochka",10));
        storageMap.put(3,new Storage(100,"Shmotki",25));

        System.out.println(storageMap.get(1).getEmployee());

        Map<Integer,MiniStorage> miniStorageMap=new HashMap<>();
        miniStorageMap.put(4,new MiniStorage(100,"Molochka",20));

        storageMap.putAll(miniStorageMap);

        System.out.println(storageMap); */


        Map<Integer,String> countries = new HashMap<>();
        countries.put(1,"USA");
        countries.put(2,"Canada");
        countries.put(3,"Russia");

        countries.put(19,"Cuba");
        countries.put(10,"japan");

        countries.remove(1);
        countries.remove(2, "Canada");
        countries.remove(3);

        System.out.println(countries.get(19));
        System.out.println(countries.keySet());
        System.out.println(countries.entrySet());
        System.out.println(countries.values());
        System.out.println(countries.containsValue("japan"));











    }
}
