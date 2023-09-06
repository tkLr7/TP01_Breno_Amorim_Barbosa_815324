import java.io.*;
import java.net.*;

public class HTML {
    public static boolean Br(String br)//verifica se ha a sequencia de caracteres <br>
     {
        return(br.length() == 4 && 
        br.charAt(0) == '<' && 
        br.charAt(1) == 'b' && 
        br.charAt(2) == 'r' && 
        br.charAt(3) == '>');
    }
    public static boolean Table(String table)//verifica se ha a sequencia de caracteres <table>
     {
        return(table.length() == 7 && 
        table.charAt(0) == '<' && 
        table.charAt(1) == 't' && 
        table.charAt(2) == 'a' && 
        table.charAt(3) == 'b' &&
        table.charAt(4) == 'l' && 
        table.charAt(5) == 'e' && 
        table.charAt(6) == '>');
    }
    public static boolean FIM (String finito)//verfica se encontra a palavra FIM
    {
        boolean retorno = (finito.length()==3);
        if(retorno)
        {
            retorno = (finito.charAt(0) == 'F');
         if(retorno)
            {
            retorno= (finito.charAt(1) == 'I');
            }
         if(retorno)
            {
            retorno = (finito.charAt(2) == 'M');
            }
        }
        return retorno;
    }
    public static void getHtml (String link, String nome) throws Exception
    {   
        String answ = "";
        String word;
        URL endereco = new URL(link); //Objeto endereco pagina web
        URLConnection conexao = endereco.openConnection();//Estabelece conexao
        BufferedReader reader = new BufferedReader(new InputStreamReader(conexao.getInputStream()));
        int contador = 0;
        int consoantes = 0;
        int contadora = 0;
        int contadore = 0;
        int contadori = 0;
        int contadoro = 0;
        int contadoru = 0;
        int contador00E1 = 0;
        int contador00E9 = 0;
        int contador00ED = 0;
        int contador00F3 = 0;
        int contador00FA = 0;
        int contador00E0 = 0;
        int contador00E8 = 0;
        int contador00EC = 0;
        int contador00F2 = 0;
        int contador00F9 = 0;
        int contador00E3 = 0;
        int contador00F5 = 0;
        int contador00E2 = 0;
        int contador00EA = 0;
        int contador00EE = 0;
        int contador00F4 = 0;
        int contador00FB = 0;
        int table= 0;
        int br = 0;
        
        while ((word = reader.readLine()) != null)//enquanto ler algo execute o codigo 
        {
            if (Table(word)) //se achar <table> adiocana ao contador
            {
                table++;    
            }
            else
            {
                if (Br(word)) //se achar <br> adiciona ao contador  
                {
                    br++;
                }
                else
                {
                    while (contador < word.length())//while para testar vogais com e sem acento e as consoantes
                    {
                        if ('a'== word.charAt(contador)) 
                        {
                            contadora++;
                        }
                        else
                        {
                        if ('e'== word.charAt(contador)) 
                        {
                            contadore++;
                        }
                        else
                        {
                        if ('i'== word.charAt(contador)) 
                        {
                            contadori++;    
                        }
                        else
                        {
                        if ('o'== word.charAt(contador)) 
                        {
                            contadoro++;    
                        }
                        else
                        {
                        if ('u'== word.charAt(contador)) 
                        {
                            contadoru++;    
                        }
                        else
                        {
                        if ('\u00E0'== word.charAt(contador)) 
                        {
                            contador00E0++;    
                        }
                        else{
                        if ('\u00E1'== word.charAt(contador)) 
                        {
                            contador00E1++;    
                        }
                        else
                        {
                        if ('\u00E2'== word.charAt(contador)) 
                        {
                            contador00E2++;
                        }
                        else
                        {
                        if ('\u00E3'== word.charAt(contador)) 
                        {
                            contador00E3++;
                        }
                        else
                        {
                        if ('\u00E8'== word.charAt(contador)) 
                        {
                            contador00E8++;
                        }
                        else
                        {
                        if ('\u00E9'== word.charAt(contador)) 
                        {
                            contador00E9++;
                        }
                        else
                        {
                        if ('\u00EA'== word.charAt(contador)) 
                        {
                            contador00EA++;    
                        }
                        else
                        {
                        if ('\u00EC'== word.charAt(contador)) 
                        {
                            contador00EC++;    
                        }
                        else
                        {
                        if ('\u00ED'== word.charAt(contador)) 
                        {
                            contador00ED++;
                        }
                        else
                        {
                        if ('\u00EE'== word.charAt(contador)) 
                        {
                            contador00EE++;    
                        }
                        else
                        {
                        if ('\u00F2'== word.charAt(contador)) 
                        {
                            contador00F2++;    
                        }
                        else
                        {
                        if ('\u00F3'== word.charAt(contador)) 
                        {
                            contador00F3++;    
                        }
                        else
                        {
                        if ('\u00F4'== word.charAt(contador)) 
                        {
                            contador00F4++;    
                        }
                        else
                        {
                        if ('\u00F5'== word.charAt(contador))
                        {
                            contador00F5++;    
                        }
                        else
                        {
                        if ('\u00F9'== word.charAt(contador)) 
                        {
                            contador00F9++;    
                        }
                        else
                        {
                        if ('\u00FA'== word.charAt(contador)) 
                        {
                            contador00FA++;
                        }
                        else
                        {
                        if ('\u00FB'== word.charAt(contador)) 
                        {
                            contador00FB++;    
                        }
                        else
                        {
                        if ('a' <= word.charAt(contador) && word.charAt(contador) <= 'z') {
                            consoantes++;    
                        }
                        }
                        }
                        }
                        }
                        }
                        }
                        }
                        }
                        }
                        }
                        }
                        }
                        }
                        }
                        }
                        }
                        }
                        }
                        }
                        }
                        }
                        }
                        contador++;    
                    }
                }
                contador++;
            }
            contador = 0;
        }
        answ = ("a("+contadora+") e("+contadore+") i("+contadori+") o("+contadoro+") u("+contadoru+
        ") á("+contador00E1+") é("+contador00E9+") í("+contador00ED+") ó("+contador00F3+") ú("+contador00FA+
        ") à("+contador00E0+") è("+contador00E8+") ì("+contador00EC+") ò("+contador00F2+") ù("+contador00F9+
        ") ã("+contador00E3+") õ("+contador00F5+") â("+contador00E2+") ê("+contador00EA+") î("+contador00EE+") ô("+contador00F4+") û("+contador00FB+") consoante("+consoantes+") <br>("+br+") <table>("+table+") "+nome);
        
        MyIO.println(answ);
        reader.close();
    } 
    
    public static void main(String[] args) throws Exception 
    {
        String famous = MyIO.readLine();
        while (!FIM(famous)) 
        {
            String link = MyIO.readLine();
            getHtml(link, famous);
            famous = MyIO.readLine();    
        }
    }
}
