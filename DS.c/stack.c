#include<stdio.h>
#define N 5
int stack[N];
int top=-1;
void push(){
    int x;
    printf("Enter the data:");
    scanf("%d",&x);
    if(top==N-1){
        printf("Overflow");
    }
    else{
        top++;
        stack[top]=x;
    }
}
void pop(){
    int item;
    if(top==-1){
        printf("Underflow");
    }
    else{
        item=stack[top];
        top--;
    }
    printf("%d\n",item);
}
void peek(){
    if(top==-1){
        printf("Stack is empty");
    }
    else{
        printf("%d\n",stack[top]);
    }
}
void display(){
    int i;
    for(i=top;i>=0;i--){
        printf("%d\t",stack[i]);
    }
}
void main()
{
    int ch;
    do{
        printf("Enter your choice for operation:");
        scanf("%d",&ch);
        switch (ch){
            case 1:
            push();
            break;
            case 2:
            pop();
            break;
            case 3:
            peek();
            break;
            case 4:
            display();
            break;
            default:
            printf("Invalid Choice:");
        }
        }    while(ch!=0);
}