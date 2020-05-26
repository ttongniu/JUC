package com.rite;
// 1. extends Thread  2.implements runable 3.Executors
public class howtoclassThread {

     static  class  myThread extends Thread{
       @Override
       public void run() {
         super.run();
       }
     }
   static class myRun implements Runnable {
     @Override
     public void run() {
       System.out.println("hello");
     }
   }

  public static void main(String[] args) {
    new myThread().start();
    new Thread(new myRun()).start();
    new Thread(()->{
      System.out.println("hello");
    }).start();

  }


}
