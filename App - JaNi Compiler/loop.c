#include <stdio.h>

int main(){
   long int i;
   int v;
   FILE *txt;
   
   txt = fopen("SaidaLoop.txt", "w");
   
   i = 0;
   while ( i < 1000000000 ) i++;
   
   /*printf("V:\n");*/
   scanf("%d",&v);
   printf("%d\n", v*3);
   fprintf(txt, "%d", v*2);
   
   i = 0;
   while ( i < 1000000000 ) i++;
   
   fclose(txt);
   
   return 2;
}
