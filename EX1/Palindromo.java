public class Palindromo
{
    public static boolean oPalindromo(String palin)
    //metodo boolean para acha se e palindromo ou nao percorrendo a string e vendo se os caracteres sao iguais
    {
        int x = 0;
        //variavel pra percorrer a string do inicio ao fim
        
        int y = palin.length() - 1;
        //variavel pra percorrer a string do fim ao inicio
        
        while(x<=palin.length()/2)//loop ate o ambas as variaveis se encontrarem
        {
            if(palin.charAt(x)!=palin.charAt(y))
            {
                return false;
            }
            x++;//percorre 1 pra frente
            y--;//percorre 1 pra tras
        }
        return true;
    }

    public static void main(String[] args)
    //main para executar o metodo acima
    {
        boolean test=false;

        String palin="";

        palin = MyIO.readLine();

        while(!palin.equals("FIM"))
        {
            test = oPalindromo(palin);
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