import java.util.Random;
public class Alteracao {
    
    public static String Randomo (String palavra, Random gerador)
    {
        String palavran = "";
        char random1 = (char)('a'+ Math.abs(gerador.nextInt()) % 26);//gera um char aleatorio
        char random2 = (char)('a'+ Math.abs(gerador.nextInt()) % 26);//gera outro char aleatorio

        for (int i = 0; i < palavra.length(); i++) 
        {
            if (palavra.charAt(i)==random1) 
            {
                palavran+=random2;//se achar um caractere igual o char aleatorio1 adiciona o caractere a string de saida no lugar
            }
            else
            {
                palavran+=palavra.charAt(i);//copia a string de entrada a string de saida da funcao
            }
        }
        return palavran;
    }
    public static void main(String[] args) 
    {
        MyIO myIo = new MyIO();
        Random aleatorio = new Random();
        aleatorio.setSeed(4);//cria a a semente para geracao de numeros aleatorios
        

        String entrada = "";
        String saida = "";

        entrada = MyIO.readLine();
        while (!entrada.equals("FIM")) 
        {
            saida=Randomo(entrada, aleatorio);
            myIo.println(saida);
            entrada= MyIO.readLine();
        }
    }
}
