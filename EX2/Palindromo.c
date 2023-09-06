#include <stdbool.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define MAX 1000


bool ehPalindromo(char palin[]){
    
    int x = 0;//variavel pra percorrer a string do inicio ao fim
    int y = strlen(palin) - 1;//variavel pra percorrer a string do fim ao inicio

    while ( x <= strlen(palin)/2)//testa ate o X e o Y forem iguais
    {
        if (palin[x] != palin[y])//se encontrar caractere diferente = false
        {
            return false;
        }
        x++;
        y--;
    }
    return true;
}

int main()
{
   bool teste = false;

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
   
  
        teste = ehPalindromo(palin);//teste se e palindromo
        if(!teste)
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