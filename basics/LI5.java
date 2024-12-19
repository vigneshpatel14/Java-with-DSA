//package basics;
//
//import java.sql.Ref;
//
//Class MyThread extends Thread {
//        Public void run() {
//        For (int I = 1; I <= 5; i++) {
//        System.out.println(Thread.currentThread().getName() + " – Count: " + i);
//        Try {
//        // Introducing a delay using sleep()
//        Thread.sleep(1000);
//        } catch (InterruptedException e) {
//        System.out.println€;
//        }
//        }
//        }
//        }
//
//public class LI5 {
//    public  static void main(String[] args) {
//        MyThread thread1 = new MyThread();
//        MyThread thread2 = new MyThread();
//        MyThread thread3 = new MyThread();
//        // Start all three threads
//        thread1.start();
//        thread2.start();
//        thread3.start();
//        try{
//            // Using join() to wait for threads to finish
//            Thread1.join();
//            Thread2.join();
//            Thread3.join();
//        } catch (InterruptedException e) {
//            System.out.println€;
//        }
//        // Using stop() to forcefully stop a thread (deprecated, use with caution)
//        Thread1.stop();
//        Thread2.stop();
//        Thread3.stop();
//    }
//}
