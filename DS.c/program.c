/******************************************************************************

                            Online C Compiler.
                Code, Compile, Run and Debug C program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/


#include <stdio.h>

int main()
{
    int a[3][3],i,r,j,c,sum;
    printf("Enter the no of rows and columns:");
    scanf("%d %d",&r,&c);
    printf("ENter the  matrix elements :");
    for(i=0;i<r;i++){
        for(j=0;j<c;j++){
            scanf("%d",&a[i][j]);
        }
        printf("%d",a[i][j]);
    }
printf("\nPrinting the matrix elements:\n");
for(i=0;i<r;i++){
    for(j=0;j<c;j++){
       // printf("\n");
        printf("%d\t",a[i][j]);
    }
    printf("\n");
}
for(i=0;i<r;i++){
    for(j=0;j<c;j++){
if(i==0||j==0||i==2||j==2){
    printf("%d\t",a[i][j]);
}
    }
printf("\n");
    }
    printf("printing MY MATRIX:\n");
    for(i=0;i<r;i++){
    for(j=0;j<c;j++){
if(i==0||j==0||i==3||j==3){
    //printf("printing MY MATRIX");
    printf("%d\t",a[i][j]);
}
    }
printf("\n");
    }
    return 0;
}
