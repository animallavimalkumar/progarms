
public class evenodddiff {
    public static void even(int sum){
        int[]num=new int[]{2,5,1,6,3};
        for(int i=0;i<5;i++){
        if(num[i]%2==0)
    System.out.println(""+num[i]);
    sum=sum+num[i]%2==0;
    System.out.println(""+sum);
        }
        }
    public static void main(String[] args) {
        even(0);
    }
}
