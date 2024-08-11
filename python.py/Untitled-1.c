#include<stdio.h>
int main() 
{
    int sal;
    double tax;
    printf("Enter Salary of Person: ");
    scanf("%d",&sal);

    if(sal<=10000)
    {
        printf(" NO TAX");
    }else if (sal>10000 && sal<100000)
    {
        tax=sal*0.10;
        printf("%lf",tax);
    }else if(sal<100000 && sal>1000000)
    {
        tax=sal*0.25;
        printf("%lf",tax);
    }else if(sal<1000000 && sal>2000000)
    {
        tax=sal*0.40;
        printf("%lf",tax);
    }else{
        tax=sal*0.50;
        printf("%lf",tax);
    }
}