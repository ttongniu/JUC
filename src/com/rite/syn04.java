package com.rite;

/**
 * @ClassName T
 * @Description  synchronized 关键字
 * @Author niutongtong
 * @Date 2019-07-20 15:45
 * @Version V1.0
 **/
public class syn04 implements Runnable {
  private  int count = 10;

  private synchronized   void m() {  // synchronized (T.class)
    count--;
    System.out.println(Thread.currentThread().getName() + "Count =" + count);
  }

  @Override
  public void run() {
    m();
  }

  public static void main(String[] args) {
    syn04 syn=new syn04();
    for(int i=0;i<5;i++){
      new Thread(syn,"Thread"+i).start();
    }
  }

}

