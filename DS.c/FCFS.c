#include<stdio.h>
#include<stdlib.h>
int main(){
    int pid[15];
    int bt[15],n;
    printf("Enter the number of process:");
    scanf("%d",&n);
    for(int i=0;i<n;i++){
        printf("process Id ",i);
        scanf("%d",&pid[i]);
    }
    for(int i=0;i<n;i++){
        printf("Burst Time: ",i);
        scanf("%d",&bt[i]);
    }
    int wt[n];
    wt[0]=0;
    for(int i=0;i<n;i++){
        wt[i]=bt[i-1]+wt[i-1];
    }
    printf("ProcessID | Burst Time | Waiting Time | Turn Around Time\n");
    float twt=0.0;
    float tat=0.0;
    for( int i=0;i<n;i++){
        printf("%d\t\t",pid[i]);
          printf("%d\t\t",bt[i]);
            printf("%d\t\t",wt[i]);
printf("%d\t\t",bt[i]+wt[i]);
printf("\n");
twt+=wt[i];
tat+=(wt[i]+bt[i]);
    }
 /* float att, awt;
    float twt,tat;
    awt=twt\n;
    att=tat\n;*/
}