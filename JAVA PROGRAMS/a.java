import java.lang.*;
class A{
    int x=10;
    void getx()
    {
        System.out.println(x);
    }
}
class B extends A
{
    public static void main(String args[]){ 
        B b1 = new B();
        b1.getx(); 
    }
} 