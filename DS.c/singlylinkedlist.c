#include <stdio.h>
#include<stdlib.h>
void at_begin();
void at_end();
void at_pos();
void display();
struct node{
    int data;
    struct node *next;
};
struct node *head,*newnode,*temp;
int main(){
    int choice=1;
    head=0;
    int count ;
    int a;
    while(choice){
        newnode=(struct node*)malloc(sizeof(struct node));
        newnode->next=0;
        printf("Enter the data you want to insert :");
        scanf("%d",&newnode->data);
        if(head==0){
            head=temp=newnode;
        }else{
            temp->next=newnode;
            temp=newnode;
        }
        printf("do you want to continue (1/0)?:");
        scanf("%d",&choice);
    }
     temp=head;
     while(temp!=0){
         temp=temp->next;
         count++;
     }
     printf("Which operation is to be performed:");
    scanf("%d",&a);    
    switch(a){
        case 1:at_begin();
        display();
        break;
                case 2:at_end();
        display();
        break;
                case 3:at_pos();
        display();
        break;
                case 4:display();
        break;
    }
    return 0;
}
void at_begin(){
    temp=head;
    newnode=(struct node*)malloc(sizeof(struct node));
    printf("Enter the data for insert at the beginning:");
    scanf("%d",&newnode->data);
    newnode->next=0;
    newnode->next=head;
    head=newnode;
}
void at_end()
{
    temp=head;
    newnode=(struct node*)malloc(sizeof(struct node));
    printf("enter the data for insert at the end:");
    scanf("%d",&newnode->data);
    newnode->next=0;
    while(temp->next!=0){
        temp=temp->next;
    }
    temp->next=newnode;
}
void at_pos(int count){
    int pos,i=1;
    temp=head;
    newnode=(struct node*)malloc(sizeof(struct node));
    printf("enter the data for insert at a position:");
    scanf("%d",&newnode->data);
    newnode->next=0;
    printf("Enter the positon where you want to insert:\n");
    scanf("%d",&pos);
    if(pos<=0||pos>count){
        printf("Can't be  modified \n");
    }
else{
    while(i<pos-1){
temp=temp->next;
i++;
}
newnode->next=temp->next;
    temp->next=newnode;
}
    }
void display(){
    temp=head;
    printf("Your linked list:\n");
while(temp!=0){
printf("%d\t",temp->data);
temp=temp->next;
}
}