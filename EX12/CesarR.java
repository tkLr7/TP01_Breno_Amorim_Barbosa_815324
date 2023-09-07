public class Cesar {
    public static String Maistres (String cesar)
    {
        char letra;//variavel para amarmazenar a letra a ser mudada
        String saida = "";//string para saida da palavra codificada
        int codificar;//int para guardar o valor inteiro do caractere e incrementar 3

        for(int i = 0; i < cesar.length(); i++)
        {
            letra = cesar.charAt(i);//atribui um caractere a letra
            codificar = letra;//transforma letra em valor numerico

            codificar = codificar + 3;//aumenta 3 no valor da letra
            char letratres = (char) codificar;//atribui o valor da letra mais 3 a letra de novo

            saida+=letratres;//construi o char de saida com a nova letra
        }
        return saida;
    }
    
    public static void main(String[] args) 
{
    MyIO myIo = new MyIO();
    String palavra = "";
    String npalavra = "";

    palavra = MyIO.readLine();

    while (!palavra.equals("FIM"))//enquanto a palavra nao for FIM codifica as palavras que sao lidas
    {
        npalavra = Maistres(palavra);
        myIo.println(npalavra);
        palavra = MyIO.readLine();    
    }


}
}

