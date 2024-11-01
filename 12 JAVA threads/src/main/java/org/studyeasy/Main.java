package org.studyeasy;


import static java.lang.Thread.sleep;

class Counter extends Thread {
     private int count;

     public Counter(int count) {
         this.count = count;
     }

     @Override
     public void run() {
         try {
             countMe();
         } catch (InterruptedException e) {
             throw new RuntimeException(e);
         }
     }

     public void countMe() throws InterruptedException {
         for (int i=0;i<10 ;i++){
             sleep(500);
             System.out.println("Thread NO:"+count +" Iteration Number"+i) ;
         }
     }
 }
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {

        Counter counter1= new Counter(1);
        Counter counter2= new Counter(2);

        long startTime=System.currentTimeMillis();
        counter1.start();
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@");
        counter2.start();
        sleep(1100);
        long endTime=System.currentTimeMillis();

        System.out.println("total time for processing "+(endTime-startTime)+" ms");


    }


}