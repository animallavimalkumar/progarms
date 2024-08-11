//import java.util.Scanner;

import java.net.SocketPermission;
import java.util.Scanner;

public class practice {
    
    public static void main(String[] args) {
   // float a= 7/4.0f *9/2.0f;
       // System.out.println(+a);
       // Checking the grade
 /*    char grade='F';
    grade=(char)(grade+8);
    System.out.println(grade);
    //decrypt
    grade=(char)(grade-8);
    System.out.println(grade);
    //
int a=50;
System.out.println("Enter an integer:");
Scanner sc=new Scanner(System.in);
int b=sc.nextInt();
if(b<a){
    System.out.println(+b+" is smaller than the 50");
}
else{
    System.out.println(+b+" is greater than the 50");

}
*
public class speed {
    public static void main(String[] args) {
       int u,v,a,s;
       u=5;
       v=6;
       a=2;
       s=4;
       float y=(v*v-u*u)/2*a*s;
       System.out.println(y);
 */  //    System.out.println(7*49/7);
       //System.out.println(7*49/7+35/7);
    // Practice Sheet 2
    /*String name="      AnushaMAM";
    System.out.println(name.toLowerCase());
    System.out.println(name.replace("","_____"));
    String letter="Dear </name>,Thanks a lot";
    System.out.println(letter.replace("</name>","harry"));
    String hi="Dear Harry,This Java Course in  very nice and \tawesome\n We All are very Happy with this course\n";
    System.out.println(hi);*/
// Practice Sheet -4
/*int a=10;
if(a==11){
    System.out.println("I AM 11");
}
else{
    System.out.println("I am not 11");
}*
System.out.println("Enter the M1 Subject marks:");
Scanner a=new Scanner(System.in);
int m1=a.nextInt();
System.out.println("Enter the M2 Subject marks:");
Scanner b=new Scanner(System.in);
int m2=b.nextInt();
System.out.println("Enter the M3 Subject marks:");
Scanner c=new Scanner(System.in);
int m3=c.nextInt();
float total=(m1+m2+m3)/3.0f;
System.out.println(total);
if(total>=40&&m1>=33&&m2>=33&&m3>=33){
    System.out.println("Pass");
}
else{
System.out.println("Fail");
}
/*int ch;
System.out.println("Enter the Day:");
Scanner sc=new Scanner(System.in);
ch=sc.nextInt();
switch(ch){
    case 1:
    System.out.println("Monday");
    break;
    case 2:
    System.out.println("Tuesday");
    break;
    case 3:
    System.out.println("Wednesday");
    break;
    case 4:
    System.out.println("Thursday");
    break;
    case 5:
    System.out.println("Friday");
    break;
    case 6:
    System.out.println("Saturday");
    break;
    case 7:
    System.out.println("Sunday");
    break;
    default:
    System.out.println("Invalid Day");
}*
int year;
System.out.println("Enter the Year:");
Scanner sc=new Scanner(System.in);
year=sc.nextInt();
if(year%4==0){
    System.out.println(+year+"   is a Leap Year");
}
else{
    System.out.println(year+" is  not a leap year");
}

String web;
System.out.println("enter the webpage you want to search:");
Scanner sc=new Scanner(System.in);
web =sc.nextLine();
if( web.endsWith(".com")){
    System.out.println("It is a commercial Website");
}
else if(web.endsWith(".org")){
    System.out.println("It is a Organisation Website");
}
else if(web.endsWith(".in")){
    System.out.println("It is a Government Website");
}
else{
    System.out.println("Invalid Website");
}

int n,i,j;
System.out.println("Enter the N value:");
Scanner sc =new Scanner(System.in);
n=sc.nextInt();
for(i=0;i<n;i++){
    for(j=0;j<=i;j++){
        System.out.print(" *");
    }
    System.out.println("");
}


		int i=0;
		int n,sum=0;
		System.out.println("Enter n value:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
while(i<=n){
  if(i%2==0)
        System.out.println(i);
        i++;
    
        sum=sum+i;
      
    }
        System.out.println("Sum:"+sum);
	
        int n=5;
        for(int i=0;i<=10;i++){
            System.out.println(n+ "*"+i+"="+n*i);
        }
    }
    /******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
/*import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        System.out.println("Enter a value:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
            //System.out.println(fact);
        }
                    System.out.println("Factorial of a given number:"+fact);
    }
}
}*
// Printing the table in reverse order
int sum=0;
int n=10;
for(int i=10;i>=1;i--){
    sum=sum+n*i;
    System.out.println(n+"*"+i+"="+n*i);
}
System.out.println(sum);
    }
/// Printing a number for several times
for(int i=0;i<=5;i++){
    System.out.println("2");
}
/
int i=1;
while(i<5){
System.out.println("1");
i++;
}

 *
// Array declaration and accessing
int[] marks={10,20,30,40,50};
for (int i : marks) {
    System.out.println(+i);
}
        System.out.println("Length of the array:"+marks.length);
// Finding the maximum and minimum of the array elements in the array
int [] marks={10,20,30,40,50};
int max,min;
int sum=0;
max=marks[0];
min=marks[0];
for(int i=0;i<marks.length;i++){
if(max<marks[i]){
    max=marks[i];
}
else if(min>marks[i]){
    min=marks[i];
}
sum=sum+marks[i];
}
System.out.println("Maximum element in the arrray:"+max);
System.out.println("Minimum element in the arrray:"+min);
System.out.println("Sum:"+sum);    
*
float []per={18.50f,78.50f,67.80f,34.90f,89.30f};
float sum=0.00f;
for (int i=per.length-1;i<=0;i++){
    
    sum=sum+per[i];
    System.out.println(i);
}
System.out.println("Sum:"+sum);
*
// REVERSING THE ARRAY
int [] a={1,2,3,4,5,6,7};
int l=a.length;
int n=Math.floorDiv(l,2);
int temp;
for(int i=0;i<n;i++){
    temp=a[i];
    a[i]=a[l-i-1];
    a[l-i-1]=temp;
}
for (int j : a) {
    System.out.println(+j+"");
    
}
// Matrix addition
int a[][]={{1,3},{2,4}};
int b[][]={{1,2},{3,5}};
	int c[][]=new int[2][2];
	for (int i=0;i<2;i++){
	    for(int j=0;j<2;j++){
	        c[i][j]=a[i][j]+b[i][j];
	        System.out.print(c[i][j]+"\t");
	    }
	
	    System.out.println("");
	}  
	*
    static  int sum(int ...arr){
        int result=0;
  for(int a:arr){
      result+=a;
      
  }
         return result;  
      }
       
      
          System.out.println("hello, world");
          System.out.println(sum(3));
          System.out.println(sum(3,5));
          System.out.println(sum(3,5,5,1));
          System.out.println(sum(3,5,4));
      }
  }	    
*/
/*
public class Main {
    static  int sum(int ...arr){
        int result=0;
  for(int a:arr){
      result+=a;
      
  }
         return result;  
      }
       
      
      public static void main(String[] args) {
          System.out.println("hello, world");
          System.out.println("Sum of the first ten odd numbers:"+sum(1,3,5,7,9,11,13,15,17,19));
          System.out.println("Sum of the first Ten Evennumbers:" +sum(2,4,6,8,10,12,14,16,18,20));
          System.out.println("Sum of the first 20 natural numbers:"+sum(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20));
          System.out.println("Sum of the first prime  numbers upto 20:"+sum(2,3,5,7,11,13,17,19));
      }
  }
*
// sum of n natural numbers
public class Main
{
    static void Nsum(int n){
        int sum=0;
        for(int i=0;i<=n;i++){
            sum=sum+i;
        }
         System.out.printf("Sum of the %d natural numbers:%d",n,sum);
    }
	public static void main(String[] args) {
	Nsum(10);
	}
    // Fibonacci  using recursion
	class Main{  
        static int n1=0,n2=1,n3=0;    
        static void printFibonacci(int count){    
           if(count>0){    
                n3 = n1 + n2;    
                n1 = n2;    
                n2 = n3;    
                System.out.print(" "+n3);   
                printFibonacci(count-1);    
            }    
        }    
        public static void main(String args[]){    
         int count=10;    
         System.out.print(n1+" "+n2);//printing 0 and 1    
         printFibonacci(count-2);//n-2 because 2 numbers are already printed   
        }  
    */  }  

    public class Cellphone {
        public  static void callFriend(){
            System.out.println("Calling to Vinay...");
        }
        public  static void ringing(){
            System.out.println("Ringing...");
        }
        public  static void vibrating(){
            System.out.println("Vibrating...");
        }
    
        public static void main(String[] args) {
            Cellphone c=new Cellphone();
            c.callFriend();
            c.ringing();
            c.vibrating();
        }
    }  
    // USING OF GET AND SET METHODS //
    /**
 * Employee
 */
public class Employee {
    int salary;
    String name;
public int getsalary(){
    return salary;
}
public String getName(){
    return name;
}
public void setName(String n){
    name=n;
}
    public static void main(String[] args) {
        Employee e=new Employee();
        e.setName("Vimal");
        System.out.println("Name:"+e.getName());
        e.salary=25000;
System.out.println("Salary:"+e.getsalary());
    }
}
}
/**
 * Square
 */
public class Square {
    int area;
    int perimeter;
        public void side(int side){
            area=side*side;
            perimeter=4*side;
            System.out.println("Side of the square:"+side);
            System.out.println("Area of the square:"+area);
            System.out.println("Perimeter of the square:"+perimeter);
        }
        public static void main(String[] args) {
            Square s=new Square();
            s.side(5);
        }
    }

/**
 * Rectangle
 */
public class Rectangle {

    int length;
    int breadth;
    //int area;
    int perimeter;
    public  static void  given(int length,int breadth){
      int  area=length*breadth;
      int perimeter=2*(length+breadth);

        System.out.println("Length of the Rectangle: "+length);
        System.out.println("breadth of the Rectangle:"+breadth);
        System.out.println("Area of the Rectangle:"+area);
        System.out.println("Perimeter of the Rectangle:"+perimeter);
    }
    public static void main(String[] args) {
        given(10,20);

    }
}   
}
/**
 * Rectangle
 */
public class Circle{
    // pi,radius;
        public  static void  given(double pi,int radius){
          double  area=pi*radius;
          double perimeter=2*pi*radius;
            System.out.println("Radius of the Circle: "+radius);
            System.out.println("Area of the Circle:"+area);
            System.out.println("Perimeter of the Circle:"+perimeter);
        }
        public static void main(String[] args) {
            given(3.14,20);
    
        }
    }   
}
interface Bicycle{
    void speedup(int increment);
    void applyBrake(int decrement);
}
class my implements Bicycle{
    int speed;
    public void speedup(int increment){
        speed=speed+increment;
        System.out.println("We are increasing the speed  by  " +speed+"   km/hr");
    }
    public void applyBrake(int decrement){
        speed=speed-decrement;
        System.out.println("We are  decreasing the speed by "+speed+"   km/hr");
    }
    public static void main(String [] args){
        Bicycle b=new my();
        b.speedup(9);
        b.applyBrake(8);
            
    
    }
}





  
 
   
