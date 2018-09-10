#include <string.h>
#include <stdio.h>


struct {
    char name[40];
    int age;
}person,person_copy;
int main(int argc, char const *argv[])
{
    char myname[]="Pierre de Fermat";
    char hello[]="hello";
    memcpy(person.name,myname,strlen(myname)+1);
    char c=hello[0];
    int i=0;
    while(c!='\0'){
        ++i;
        c=hello[i];
        
    }
    printf("this is all: %d %d\n",i,sizeof(hello));
    person.age=46;
    memcpy(&person_copy,&person,sizeof(person));
    printf("person_copy: %s, %d\n",person_copy.name,person_copy.age);
    char str[]="http://www.ahut.edu.cn";
    const char ch='.';
    char *ret;
    ret=(char *)memchr(str,ch,strlen(str));
    printf("%c之后的字符串是:%s\n",ch,ret);
    char str1[15];
    char str2[15];
    int ret1;
    memcpy(str1,"abcdsf",6);
    memcpy(str2,"abcaos",6);
    ret1=memcmp(str1,str2,5);
    if(ret1>0){
        printf("str2小于str1\n");
    }else if(ret1<0){
        fprintf(stdout,"str2大于str1\n");
    }else{
        printf("相等\n");
    }
    char set[50];
    memcpy(set,"adcdefg",7);
    puts(set);
    memset(set,'&',20);
    printf("%s\n",set);
    char src[50],dest[50];
    strcpy(src,"This is source ");
    strcpy(dest,"This is destination");
    strcat(dest,src);
    printf("%s\n",dest);
    printf("%s\n",strchr(str,'.'));
    printf("%d\n",strspn(str1,str2));
    printf("%s\n",(int *)strstr("abcdefghijk","cde"));
    char *token;
    const char s[2]=".";
    token=strtok(str,s);
    while(token!=NULL){
        printf("%s\n",token);
        token=strtok(NULL,s);
    }
    return 0;
}
