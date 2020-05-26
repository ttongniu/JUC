package com.rite;

public class whatisThread {

     private static class T1 extends Thread{

       @Override
       public void run() {
         for(int i=0;i<10;i++){
           try {
             Thread.sleep(Long.parseLong("1000"));
           } catch (InterruptedException e) {
             e.printStackTrace();
           }finally {
             System.out.println("T1");
           }
         }
       }
     }

  public static void main(String[] args) {
      // new T1().run();//方法调用
       new T1().start(); //线程启动
    for(int i=0;i<10;i++){
      try {
        Thread.sleep(Long.parseLong("1000"));
      } catch (InterruptedException e) {
        e.printStackTrace();
      }finally {
        System.out.println("main");
      }
    }
  }

}
