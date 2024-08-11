#include<stdio.h>
int main(){
    int arr[5]={3,4,2,4,3};
    for (int i = 0; i<=5; i++)
    {
    for(int j=i+1;j<=5;j--){
        if(arr[i]==arr[j]){
        printf("%d",arr[j]);
        }
    }
    }
    
}