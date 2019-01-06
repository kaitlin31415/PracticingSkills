import java.util.*;

public class Hash{
    
    public static void main (String[] args){
        Hashtable<String, Integer> myFirstTable = new Hashtable<String, Integer>();
        System.out.println("The Hash Table is Empty? "+ myFirstTable.isEmpty());
        myFirstTable.put("one", 1);
        myFirstTable.put("two", 2);
        myFirstTable.put("three", 3);

        System.out.println("The Value at key 'three' is: "+ myFirstTable.get("three"));
        System.out.println("This table contains the key 'four'? " + myFirstTable.containsKey("four"));

    }
}