import java.util.Scanner;

import javax.swing.text.Style;
class Bank{
     static int balance=10000;
public void deposit(int amount ){
    int deposit ,balance;
    balance=10000;
    deposit=amount+balance;
    System.out.println("Amount Deposited:"+amount);
    System.out.println("Your Amount is processing in...");
    System.out.println("Balance Amount:"+deposit);
    System.out.println("Thank you for your Visit ");


}
public void Withdraw(int amount){
    int withdraw ,balance;
    balance=10000;
    withdraw=balance-amount;
    System.out.println("Amount Withdrawl:"+amount);
    System.out.println("Your Amount is processing out...");
    System.out.println("Balance Amount:"+withdraw);
    System.out.println("Thank you for your Visit ");
}
    
    public static void main(String args[]){
        int balance=10000;
        System.out.print("Enter your pin number:");
        Scanner sc=new Scanner(System.in);
        int pin=sc.nextInt();
        System.out.println("Select Withdraw or Deposit: \n 1.Withdraw 2.Deposit");
        Scanner c=new Scanner(System.in);
        int ch=c.nextInt();
      switch(ch){
            case 1:
           // System.out.println("Withdraw");
            break;
            case 2:
           // System.out.println("Deposit");
            break;
            default:
            System.out.println("Invlaid choice");
        }
        System.out.println("Enter your Amount:");
        Scanner d=new Scanner(System.in);
        int amount=d.nextInt();
   Bank b=new Bank();
    if(ch==2){
    b.deposit(amount);
    }
    else if(ch==1){
    b.Withdraw(amount);
    }
    else{
        System.out.println("Invalid Amount");
    }
    }
    }
