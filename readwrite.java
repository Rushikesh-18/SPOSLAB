import java.util.*;
import java.util.concurrent.Semaphore;
public class readwrite {

    static Semaphore readLock=new Semaphore(1); 
    static Semaphore writeLock=new Semaphore(1); 
    static int readCount=0;
    static class Read implements Runnable
    {
        public void run()
        {
            try {
                readLock.acquire();//Single reader comes at a time and increases readcount
                readCount++;
                if(readCount==1)//when first reader comes
                {
                    writeLock.acquire();//if writer is present when reader cames reader is blocked up and if writer is not present lock is put up so no writer can enter
                }
                    readLock.release();  //making available for entry of new reader
                    System.out.println("Thread"+Thread.currentThread().getName()+"is running");
                    Thread.sleep(1500);
                    System.out.println("Thread"+Thread.currentThread().getName()+"has finished running");
                    readLock.acquire();
                    readCount--;
                    if(readCount==0)
                    {
                        writeLock.release();
                    }
                    readLock.release();
                } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }

        }
    }
    static class Write implements Runnable
    {
        public void run()
        {
            try {
                writeLock.acquire();//Access to on e writer at atime
                System.out.println("Thread"+Thread.currentThread().getName()+"is writing");
                Thread.sleep(2500);
                System.out.println("Thread"+Thread.currentThread().getName()+"has finished");
                writeLock.release();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args) throws Exception
    {
        Read read=new Read();
        Write write =new Write();
        Thread t1=new Thread(read);
        t1.setName("Thread1");
        Thread t2=new Thread(read);
        t2.setName("Thread2");
        Thread t3=new Thread(write);
        t3.setName("Thread3");
        Thread t4=new Thread(read);
        t4.setName("Thread4");
        Thread t5=new Thread(read);
        t5.setName("Thread5");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
    
}
