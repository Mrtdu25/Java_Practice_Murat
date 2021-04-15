package Collection;


import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Map {

    public static void main(String[] args) {

        Hashtable<Integer,String> ht=new Hashtable<>();
        ht.put(101,"Murat");
        ht.put(102,"Duaa");
        ht.put(103,"Hamid");
        ht.put(104,"Sofia");
        //ht.put(null,"Cabbar"); Hashtable does not accept null key
        //ht.put(105,null); //Hashtable does not accept null value

        System.out.println(ht);

       // System.out.println("ht.remove(101) = " + ht.remove(101));
        //System.out.println("ht.remove(101,\"Murat\") = " + ht.remove(101, "Murat"));

        System.out.println("ht.get(101) = " + ht.get(101));

        for (Integer eachKey : ht.keySet()) {
            System.out.println(eachKey+"     "+ht.get(eachKey));
        }

        for (String eachValue : ht.values()) {
            System.out.println(eachValue);

        }

        for (Entry<Integer, String> keysAndValues : ht.entrySet()) {
            System.out.println(keysAndValues.getKey()+"     "+keysAndValues.getValue());

        }

       Set s= ht.entrySet();
        Iterator it = s.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("=========================================");
        Iterator<Entry<Integer, String>> itr = ht.entrySet().iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }


    }



}
