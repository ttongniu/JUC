package com.rite;

public class sleepYieldJoin {

    static  void testSleep(){
      new Thread(()->{
        for(int i=0;i<10;i++){
          try {
            System.out.println("A"+i);
            Thread.sleep(Long.parseLong("1000"));
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
        }

      }
      ).start();
    }

  static  void testYield(){
    new Thread(()->{
      for(int i=0;i<10;i++) {
        System.out.println("A" + i);
        if(i%2==0)
        Thread.yield();//让出CPU 回到等待队列
      }
    }
    ).start();

    new Thread(()->{
      for(int i=0;i<10;i++) {
        System.out.println("B" + i);
        if(i%2==0)
        Thread.yield();
      }
    }
    ).start();
  }


  static  void testJoin(){
   Thread t1 = new Thread(()->{
      for(int i=0;i<10;i++) {
        System.out.println("A" + i);
        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    }
    );

  Thread t2 =  new Thread(()->{
    try {
      t1.join(); // t1加入到t2  t1执行完再执行t2
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
    );
  }
}
