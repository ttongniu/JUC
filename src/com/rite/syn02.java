package com.rite;

/**
 * @ClassName T
 * @Description  synchronized 关键字 并不是锁代码块 而是锁对象
 * @Author niutongtong
 * @Date 2019-07-20 15:45
 * @Version V1.0
 **/
public class syn02 {
  private int count = 10;

  public void m() {
    //任何线程要执行下面代码 必须先拿到this对象的锁
    synchronized (this) {
      count--;
      System.out.println(Thread.currentThread().getName() + "Count =" + count);
    }
  }
}
