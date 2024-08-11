public class my {
    public static void main(String[] args) {
        int sum=0;
        int [] marks=new int[]{2,5,6,3,21,5};
        for(int i=0;i<marks.length;i++){
            if(marks[i]%2==0)
                System.out.println(""+marks[i]);
                sum+=marks[i];
                System.out.println(""+sum);
        }
        }
}
