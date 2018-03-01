#include<stdio.h>
int main(void)
{
    int a,b=0,c=1;
    char STRING[]="TFy!QJu ROo TNn(ROo)SLq SLq ULo+UHs UJq TNn*RPn/QPbEWS_JSWQAIJO^NBELPeHBFHT}TnALVlBLOFAkHFOuFETpHCStHAUFAgcEAelclcn^r^r\\tZvYxXyT|S~Pn SPm SOn TNn ULo0ULo#ULo-WHq!WFs XDt!";
    while(STRING[b]!='\0')
    {
        a=STRING[b];
        while(a>64)
        {
            if(c==80)
            {
               c=0;
               printf("\n");
            }
            else
            {
                if(b%2==0)
                    printf(" ");
                else
                    printf("!");
            }
            c++;
            a--;
        } 
        b++;
    } 
    printf("RRS Creations ......");
}


//Another Way

/*#include <stdio.h>
char STRING[]="TFy!QJu ROo TNn(ROo)SLq SLq ULo+UHs UJq TNn*RPn/\
QPbEWS_JSWQAIJO^NBELPeHBFHT}TnALVlBLOFAkHFOuFETpHCS\
tHAUFAgcEAelclcn^r^r\\tZvYxXyT|S~Pn SPm SOn TNn ULo0ULo#ULo-WHq!WFs XDt!";
int main(void)
{
    int a,b,c,flag;
    for(b=0,c=10; a=STRING[b++];)
    {
    		 flag=0;
          for(;a>64;a--)
          {
          		//flag++;
              // printf("%d\n",a);
			   putchar(++c=='Z'?c=c/9: 33^b&1);
          }
        
          
    }
     printf("\nBy RRS Creations......");
    
}
*/

