package org.studyeasy;

import java.util.LinkedList;
import java.util.Queue;

/*
* add() - Inserts the specified element into the queue. If the task is successful, add() returns true, if not it throws an exception.
offer() - Inserts the specified element into the queue. If the task is successful, offer() returns true, if not it returns false.
element() - Returns the head of the queue. Throws an exception if the queue is empty.
peek() - Returns the head of the queue. Returns null if the queue is empty.
remove() - Returns and removes the head of the queue. Throws an exception if the queue is empty.
poll() - Returns and removes the head of the queue. Returns null if the queue is empty.
*
*
*
*
* */
public class Main {
    public static void main(String[] args) {
         Queue<String> Animal = new LinkedList<>();

        Animal.add("Mammal");
        Animal.offer("Bird");
        Animal.offer("Cat");
        Animal.offer("Dog");



        System.out.println(Animal);

//        System.out.println(Animal.peek());
//        System.out.println("After Peek"+Animal);
//        System.out.println(Animal.poll());
//        System.out.println("After Poll"+Animal);
        System.out.println(Animal.element());
        System.out.println("After Element"+Animal);
        System.out.println(Animal.remove());
        System.out.println("After Remove"+Animal);


    }
}