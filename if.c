#include <stdio.h>
int main(void){
    int i=2000;
    while(i<=2050){
        int x=0;
    if(i%4==0&&i%100!=0 ){
        printf("%d\n",i);
        x++;
    }else{
        if(i%400==0) {x++;}
    }
    ++i;
    }
    /*
    if(i/4==0){
        if(i/100==0) printf("不是闰年");
        else printf("是闰年");
    }else{
        if(i/400==0) printf("是闰年");
        else printf("NO");
    }


    */
   int x=2000/400;
   printf("%d\n",x);
    return 0;
}       