
import java.util.LinkedList;
import java.util.List;


//Type of parameter

/*
 * T-Type
 * E-Element
 * K-key
 * V-Value
 * */

class TypeParameter<K,V>{
    private K key;
    private V value;


    public TypeParameter(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "TypeParameter{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
    public <E ,N>void display(E element,N number){
        System.out.println("Element: "+element+" Number: "+number);
    }
}


class Data <T>{
    private T object;

    public Data(T object){
        this.object = object;
    }

    @Override
    public String toString() {
        return object.toString();
    }

    public T getObject() {
        return object;
    }


}




public class Main {
    public static void main(String[] args) {


        Data <String> m=new Data<String>("Hello");
//Generics for List
        List<Data<String>> elements= new LinkedList<Data<String>>();
        elements.add(new Data<>("Pansilu"));
        elements.add(new Data<>("Ruvinsara"));

        for (Data<String> data:elements ){
            System.out.println(data);
        }

        System.out.println(m);
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        //Type of parameter
        TypeParameter<Integer ,String> keyValue = new TypeParameter(18,"Pansilu");
        System.out.println(keyValue);

        //using parameterize method
        keyValue.display("test",50);
    }
}