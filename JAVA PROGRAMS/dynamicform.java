import java.util.Scanner;
class dynamicform{
    public static void main(String [] args)
{
   System.out.println("DYNAMIC FORM USING JAVA");
   System.out.print("Enter Your Full  Name:");
   Scanner sc=new Scanner(System.in);
   String name= sc.next();
   System.out.print("Enter Your Age:");
   Scanner c=new Scanner(System.in);
   int  age= c.nextInt();
   System.out.print("Enter Your Qualifications:");
   Scanner ac=new Scanner(System.in);
   String  Qualifications= ac.next();
   System.out.print("Enter Your Profession:");
   Scanner wc=new Scanner(System.in);
   String Profession= wc.next();
   System.out.print("Enter Your  Habitats:");
   Scanner ec=new Scanner(System.in);
   String Habitats= ec.next();
   System.out.print("Enter Your Marks Percentage:");
   Scanner oc=new Scanner(System.in);
   String Percentage= oc.next();
   System.out.print("Enter Your Area of Interest:");
   Scanner pc=new Scanner(System.in);
   String Interest= pc.next();
   Scanner d= new Scanner(System.in);
   String alldetails= d.next();
if(alldetails.equals("OK")|| alldetails.equals("ok")|| alldetails.equals("Ok")){
    System.out.println("Your  deatils are recorded ");
}
else{
    System.out.println("Your Details are not Correct");
}

}
}