class Mythread1 extends Thread{
    public void run(){
        for(int i=0;i<=10;i++){
System.out.println("Number:"+i);
try{
Thread.sleep(2000);  
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
}
class Mythread2 extends Thread{
    public void run(){
        System.out.println("hello world ");
    }
}
public class Happy{

    public static void main(String[] args){
Mythread1 m1=new Mythread1();
Mythread2 m2=new Mythread2();
m1.start();  
m2.start();
}
 }
