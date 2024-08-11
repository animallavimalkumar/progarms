#include<stdio.h>
int main(){
    int pid[15],bt[15],n;
printf("Enter the no of processes:");
scanf("%d",&n);
printf("Enter the processes Id:");
for(int i=0;i<n;i++){
scanf("%d",&pid[i]);
}
printf("Enter the Burst Time:");
for(int i=0;i<n;i++){
scanf("%d",&bt[i]);
}
int i,wt[n];
wt[0]=0;
for(i=0;i<n;i++){
wt[i]=bt[i-1]+wt[i-1];
}
printf("Process Id| Burst Time | Waiting time | Turn Around Time");
float tat=0.0f;
float twt=0.0f;
for(int i=0;i<n;i++){
    printf("%d\t\t",pid[i]);
    printf("%d\t\t",bt[i]);
    printf("%d\t\t",wt[i]);
    printf("%d\t\t",wt[i]+bt[i]);
    printf("\n");
    twt+=wt[i];
    tat+=(wt[i]+bt[i]);
}
float awt,att;
att=tat\n;
awt=twt\n;
printf("Average waiting time :%d",awt);
print("Average Turn around time:%d",att);
}
