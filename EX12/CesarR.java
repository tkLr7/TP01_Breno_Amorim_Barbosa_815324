public class CesarR {
    public static String Maistres (String cesar, int i)
    {
        if (i == cesar.length()) {
            return "";
        }
        char letra;//variavel para amarmazenar a letra a ser mudada
        int codificar;//int para guardar o valor inteiro do caractere e incrementar 3
        

            letra = cesar.charAt(i);//atribui um caractere a letra
            codificar = letra;//transforma letra em valor numerico
            codificar = codificar + 3;//aumenta 3 no valor da letra

            char letratres = (char) codificar;
        
        return letratres + Maistres(cesar, i + 1);
    }
    
    public static void main(String[] args) 
{
    MyIO myIo = new MyIO();
    String palavra = "";
    String npalavra = "";

    palavra = MyIO.readLine();

    while (!palavra.equals("FIM"))//enquanto a palavra nao for FIM codifica as palavras que sao lidas
    {
        npalavra = Maistres(palavra, 0);
        myIo.println(npalavra);
        palavra = MyIO.readLine();    
    }


}
}

