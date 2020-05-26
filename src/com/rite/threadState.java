package com.rite;

public class threadState {

  public static void main(String[] args) {
      //new
      //runable
      //timewaiting
     //waiting
    //blocked

    Thread t = new Thread(()->{
      for(int i=0;i<10;i++){
        try {
          Thread.sleep(Long.parseLong("100"));
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    });
    System.out.println(t.getState());
    t.start();
    System.out.println(t.getState());
    try {
      t.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println(t.getState());

  }

}
