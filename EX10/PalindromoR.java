public class PalindromoR {
    public static boolean ehPalindromo(String palin, int inicio, int fim)
    //metodo boolean para acha se e palindromo ou nao percorrendo a string e vendo se os caracteres sao iguais
    {
        if (inicio >= fim)
    {
        return true;
    }
    if (palin.charAt(inicio)!=palin.charAt(fim))//se caractere no inicio diferente de caractere fim retorna falso
    {
        return false;
    }      
    return ehPalindromo(palin, inicio + 1, fim -1);//recursividade com as proximas letras atualizadas
    }

    public static void main(String[] args)
    //main para executar o metodo acima
    {
        boolean test=false;

        String palin="";

        palin = MyIO.readLine();

        while(!palin.equals("FIM"))
        {
            int comprimento = palin.length() - 1;
            test = ehPalindromo(palin, 0, comprimento);
            if(!test)//nao e palindromo
            {
                System.out.println("NAO");
            }
            else
            {
                System.out.println("SIM");
            }
            palin = MyIO.readLine();
        }
    }
}

