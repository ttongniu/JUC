# JUC
JUC-rite
线程的概念  启动方式  常用方法
synchronized(object)
 - 不能用String常量 、 integer 、long
 
线程同步
  -synchronized
     锁的是对象不是代码
     this  XX,class
     锁定方法 非锁定方法 同时执行
     锁升级

锁升级过程：偏向锁 --》自旋锁（默认10）-->重量级锁
https://www.jianshu.com/p/b43b7bf5e052
https://www.jianshu.com/p/16c8b3707436

自旋锁：线程少 执行时间短
系统锁：线程多 执行时间长



volatile 关键字 

线程可见性 - MESI    -缓存一致性协议
 
禁止指令重排序 -DCL单例  - Double cheak lock    --loadfence 原语指令  storefence 原语指令
 
 不保证原子性   使一个变量在多个线程之间可见
 *AB线程 都用到了一个变量，Java 默认A 线程中保留一份copy ，B线程中修改了该变量，则A线程中未必知道。
 * 使用volatile 关键字会让所有线程都会读到变量的修改值。
 * 在下面代码中，flag是存放在堆内存的t对象中
 * 当线程t1开始运行的时候，会把flag值从内存中读取到t1线程工作区中。在运行过程中直接使用这个copy
 * 并不会每次去读取堆内存, 当主线程修改了flag值后。t1线程感知不到该值的变化。所以不会停止运行。
 *
 *使用volatile 会强制所有线程去堆内存中读取flag的值
 
 CAS (无锁优化 自旋)
 compare AND  Set
 
 cas (V ,E New)
 if(v==E){
   v= new
 }
  otherwise try again or fail
cup原 语
 
 ABA问题 --》 版本号解决  基本数据类型没什么问题 引用有问题 （你和女朋友复合了 中间有其他女人）