package org.studyeasy;


interface Lamda{
    public void Demo();
}
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Lamda lamda1 = (()-> System.out.println("Statement 01"));
        lamda1.Demo();
        // creating threads

        Thread thread = new Thread(()-> System.out.println("Thread 01"));

    thread.start();


    }
}