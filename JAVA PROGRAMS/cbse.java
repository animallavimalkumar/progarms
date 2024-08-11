import java.util.Scanner;
public class cbse
{
	public static void main(Strme[] args) {
		System.out.print("Enter the telugu subject marks:");
		Scanner a=new Scanner(System.in);
		int tel=a.nextInt();
		System.out.println("Telugu Marks:"+tel);
System.out.print("Enter the Hindi subject marks:");
		Scanner b=new Scanner(System.in);
		int hin=b.nextInt();
		System.out.println("Hindi Marks:"+hin);
System.out.print("Enter the English subject marks:");
		Scanner c=new Scanner(System.in);
		int eng=c.nextInt();
		System.out.println("English Marks:"+eng);
    
	System.out.print("Enter the Maths subject marks:");
		Scanner d=new Scanner(System.in);
		int mat=d.nextInt();
		System.out.println("Maths Marks:"+tel);
System.out.print("Enter the Science subject marks:");
		Scanner e=new Scanner(System.in);
		int sci=e.nextInt();
		System.out.println("Science Marks:"+sci);
System.out.print("Enter the Social subject marks:");
		Scanner f=new Scanner(System.in);
		int soc =f.nextInt();
		System.out.println("Social Marks:"+soc);
    int total=tel+hin+eng+mat+sci+soc;
    double n=600.0;
    double percentage=((total/n)*100);
    System.out.println("Total Marks:"+total);
    System.out.println("Percentage:"+percentage);
	}
}