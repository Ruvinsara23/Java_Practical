package org.studyeasy;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class Main {
    public static void main(String[] args) {
// creating Set
        Set<String> set = new HashSet<String>();
        set.add("Amal");
        set.add("Bimal");
        set.add("chamila");
        set.add("Deen");

        for (String name:set){
            System.out.println(name);
            //It isn't  print in order
        }
        //types of collections
    /*
Feature	    HashSet	           LinkedHashSet	TreeSet
Order	    Unordered	       Insertion Order	Sorted Order
Performance	Fast (O(1))	       Fast (O(1))	    Slower (O(log n))
Use Case	High performance   Predictable      Sorted data and range operations
             without order     iteration order


    * */
//example for Threeset
        Set<String> set2= new TreeSet<>();
        for (int i=30; i>1; i--){
            set2.add("A"+i);
        }
        System.out.println("Set 2"+set2);

        }
 //example for LinkedHashSet
    Set<String> set3= new LinkedHashSet<>();{

        for (int i=30; i>1; i--){
            set3.add("A"+i);
        }
        System.out.println("Set 3"+set3);
    }

    }

