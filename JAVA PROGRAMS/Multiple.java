
//package Vimal;

import java.util.Scanner;
/**
* 
*/
public class Multiple {

   public static void main(String[] args) {
    
int[] marks=new int[3];
marks[0]=7;
marks[1]=56;
marks[2]=7;
System.out.println("Enter the array index you want:");
Scanner sc=new Scanner(System.in);
int ind=sc.nextInt();
try {
   System.out.println("Welcome to Videos of Java Complete Course");
try {
   System.out.println(marks[ind]);
}
catch(ArrayIndexOutOfBoundsException e) {
   System.out.println("Sorry this index does not exists");
System.out.println("Exception at Level 2");
}
}
catch(Exception e) {
   System.out.println("Exception at Level 1");
}
   }
}
