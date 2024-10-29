package org.studyeasy;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

class Data<k extends Integer,v extends String>{
    private k key;
    private v value;

    public Data(k key, v value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Data{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }

    public k getKey() {
        return key;
    }

    public v getValue() {
        return value;
    }
}


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Comparator<Data<Integer,String>>  COMPARE_KEY = new Comparator <Data<Integer,String>>() {
            @Override
            public int compare(Data<Integer,String> obj1, Data<Integer,String> obj2) {
                if (obj1.getKey()>obj2.getKey()){
                    return 1;
                }
                return 0;
            }
        };


        Set<Data<Integer,String>> set = new TreeSet<>(COMPARE_KEY);
        set.add (new Data <>(1,"Pansilu"));
        set.add(new Data<>(2,"Ruvinsara"));
        set.add(new Data<>(3,"Samaranayaka"));
        set.add(new Data<>(4,"Gunarathna"));
        set.add (new Data <>(1,"Pansilu"));
        set.add (new Data <>(1,"Pansilu"));

        for (Data data: set){
            System.out.println(data);
        }
    }



}