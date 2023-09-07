#include <stdbool.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define MAX 1000

double editFile(int tamanho)
{
    double x;
    FILE* Numeros = fopen("Numeros.txt", "w");//abrir arquivo para escrita
    if(tamanho > 0)
    {
        for (int i = 0; i < tamanho; i++)
        {
            scanf ("%lf", &x);
            fwrite(&x, sizeof(double), 1, Numeros);//escreve no arquvio
        }
    }
    fclose(Numeros);
    return x;
}
double readFile(int tamanho)
{
    double x = 0.0;
    FILE* Numeros = fopen("Numeros.txt", "r");//abre arquvio para leitura

    for (int i = 0; i < tamanho; i++)
    {
        fseek(Numeros, -8-i*8, SEEK_END );// descoloca o ponteiro pro final do arquivo
        fread(&x, sizeof(double), 1, Numeros);//le o arquivo
        printf("%g\n", x);
    }
    fclose(Numeros);
}

int main()
{
    int tamanho;
    scanf("%d", &tamanho);

    editFile(tamanho);
    readFile(tamanho);
}