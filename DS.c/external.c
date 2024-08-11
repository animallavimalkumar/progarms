#include <stdio.h>
#include<sys/ipc.h>
#include<sys/msg.h>
struct mesg buffer
{
    long msg_type;
    char msg_text[100];
} message;
int main(){
    key_t key;
    int msgid;
    key=ftok("Progfile",65);
    msgid=msgget(key,0666/IPC_CREAT);
    message.msg_type=1;
    printf("Write Data:");
    get(mesage.msg_text);
    msgsnd(msgid,&message,sizeof(message),0);
    printf("Data Sended :%s\n",message.msg_text);
    return 0;
}
// Readers Process
#include<stdio.h>
#include<sys/ipc.h>
#include<sys/msg.h>
struct mesg buffer{
    long msg.type;
    char mesg.text[100];
}message;
int main(){
key_t key;
int msgid;
key=ftok("progfile",65);
msgid=msgget(key,0666/IPC_CREAT);
msgrcv(msgid,&message,sizeof(message)1,0);
printf("Data Recieved:%s\n",message.mesg_text);
 msgctl( msgid,IPC_RMID,NULL);
return 0;
}