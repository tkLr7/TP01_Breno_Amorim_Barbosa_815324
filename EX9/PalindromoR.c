#include <stdbool.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define MAX 1000


bool ehPalindromo(char palin[], int inicio, int fim)
{

    if (inicio >= fim)
    {
        return true;
    }
    if (palin[inicio]!=palin[fim])//se caractere no inicio diferente de caractere fim retorna falso
    {
        return false;
    }      
    
        return ehPalindromo(palin, inicio + 1, fim -1);//recursividade com as proximas letras atualizadas
}

void getString(char *a)
{
    fgets(a, MAX, stdin);//recebe palavra em palin com tamanho MAX

   int comprimento = strlen(a);
   if (comprimento > 0 && a[comprimento - 1]=='\n')//remove o \n e substitui por \0
   {
     a[comprimento - 1] = '\0';
   }
}
int main()
{

   char palin[MAX];
   while (1)
   {
   getString(palin);
   if (strcmp(palin, "FIM") == 0) 
   {    //se achar fim para o loop do main
            break;
   }
    int comprimento = strlen(palin) - 1;//variavel para ler do final ao inicio da string
        if(ehPalindromo(palin, 0, comprimento))
        {
            printf("SIM\n");
        }
        else
        {
            printf("NAO\n");
        }
   
   }
   return 0;
}