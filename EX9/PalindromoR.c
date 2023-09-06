#include <stdbool.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define MAX 1000


bool ehPalindromo(char palin[], int x){
    
    bool achar = true;
    int y =  strlen(palin) - 1 - x;//variavel para ler do final ao inicio da string
    while ( x < strlen(palin)/2)//testa ate o X e o Y forem iguais
    {
        achar = (palin[x] == palin[y]);
        if (achar)//se encontrar caractere diferente = false
        {
            x++;
            achar = (achar && ehPalindromo(palin, x));
        }
        
    }
    
    return achar;
}

int main()
{

   char palin[MAX];
   while (1)
   {
   
   fgets(palin, MAX, stdin);//recebe palavra em palin com tamanho MAX

   int comprimento = strlen(palin);
   if (comprimento > 0 && palin[comprimento - 1]=='\n')//remove o \n e substitui por \0
   {
     palin[comprimento - 1] = '\0';
   }
   if (strcmp(palin, "FIM") == 0) 
   {    //se achar fim para o loop do main
            break;
   }
        if(!ehPalindromo(palin, 0))
        {
            printf("NAO\n");
        }
        else
        {
            printf("SIM\n");
        }
   
   }
   return 0;
}