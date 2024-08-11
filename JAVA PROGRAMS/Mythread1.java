import java.lang.*;
import java.io.*;
/**
 * Mythread1
 */
public class Mythread1 extends Thread {
public void run(){
    System.out.println("hello world!");
    System.out.println("Happy Coding");
}   
}
 class Mythread2 extends Thread {
    public void run(){
        System.out.println("hello world!");
        System.out.println("Happy Learning");
    }   


public static void main(String[] args){
     Mythread1 m1=new Mythread1();
     Mythread2 m2=new Mythread2();
     Thread t1 =new Thread(m1);
     Thread t2=new Thread(m2);
    t1.start();
    t2.start();
}
}