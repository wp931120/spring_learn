package multithread;

import java.time.LocalTime;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Threads {
  public static void main(String[] args) throws Exception {
    Singleton singleton = Singleton.getInstance();
    System.out.println(singleton.value);

  }
}


class Singleton{
  private static volatile Singleton instance = null;
  public int value = 0;
  private Singleton (){}

  public static Singleton getInstance(){
    if (instance == null){
      synchronized (Singleton.class){
        if(instance == null){
          instance = new Singleton();
        }
      }
    };
    return instance;
  }
}


class TaskQueue{
  Queue<String> queue = new LinkedList<>();
  public synchronized void addTask(String s){
    this.queue.add(s);
    this.notifyAll();
  }
  public synchronized String getTask() throws Exception{
    while (queue.isEmpty()){
      this.wait();
    }
    return queue.remove();
  }

}


class Reentrantlock{
  private final Lock lock = new ReentrantLock();
  private  int count = 0;

  public void add(int n){
    lock.lock();
    try {
      count += n;
    }finally {
      lock.unlock();
    }
  }

  public void desc(int n) throws Exception{
    if(lock.tryLock(1, TimeUnit.SECONDS)){
      try {
        count -= n;
      }finally {
        lock.unlock();
      }
    }
  }
}


