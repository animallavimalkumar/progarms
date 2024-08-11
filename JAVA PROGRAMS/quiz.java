import java.util.Scanner;
public class quiz {
    public static void main(String[] args) {
        String a="a";
        String b="b";
        String c="c";
        String d="d";
        System.out.println(" Choose the correct answer:");
        System.out.println(" 1.Who is the Father of Java Programming Language:");
        System.out.println("a.Dennis Ritche");
        System.out.println("b.Bajarne Stroustrop"+b);
        System.out.println("c.JamesGousling"+c);
        System.out.println("d.Guido Van Rosum"+d);
        Scanner obj=new Scanner(System.in);
        String v=obj.next();
      System.out.println("My Answer:"+c);
        if(v.equals(c)){
      System.out.println("Your Answer is correct ");
      }
      else{
        System.out.println("Your Answer is incorrect");
      }
    }
}
