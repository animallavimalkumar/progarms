/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main {
   public static void main(String[] args) {
      String name="    VimalKumar     ";
      System.out.println(name);
      System.out.println(name.length());
      System.out.println(name.toLowerCase());
       System.out.println(name.toUpperCase());
       //Trim helps to removes the white spaces
       System.out.println(name.trim());
       //Substring :Which prints from  given index to 
       //to end
       System.out.println(name.substring(3));
  System.out.println(name.substring(3,14));
   System.out.println(name.replace('V','H'));
   //System.out.println(name.replace('ar','malaya'));
      System.out.println(name.startsWith("")); 
       System.out.println(name.endsWith("")); 
        System.out.println(name.charAt(10)); 
   }   
  }
  
