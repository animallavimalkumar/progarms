import java.util.Scanner;
 class Calculator {
public static void main(Strme[] args) {
   int c;
    Scanner obj= new Scanner(System.in);
    System.out.print("Enter a value :");
  int a= obj.nextInt();
  System.out.print("Enter B value :");
  int b= obj.nextInt();
  System.out.print("Enter a  Operator :");
  Scanner sc=new Scanner(System.in);
  char ch=sc.next().charAt(0);
    switch(ch){
    case '+':
    c=a+b;
    System.out.println("Sum:"+c);
    break;
 case '-':
 c=a-b;
 System.out.println("Sub:" +c);
break;
case '*':
c=a*b;
System.out.println("Mul:"+c);
break;
case '/':
c=a/b;
System.out.println("Div:"+c);
break;
case '%':
c=a%b;
System.out.println("Rem:"+c);
break;
default:
System.out.println("Invalid operator");
}
}
 }
  