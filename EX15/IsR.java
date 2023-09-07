public class Is 
{
    public static boolean Vogal(String parametro)
    {
        
        for (int i = 0; i < parametro.length(); i++) 
        {
          char letra = parametro.charAt(i);
          
          if (letra == 'a' || letra == 'A'||//verifica se e vogal
              letra == 'e' || letra == 'E'|| 
              letra == 'i' || letra == 'I'||
              letra == 'o' || letra == 'O'|| 
              letra == 'u' || letra == 'U'
             ) 
          {
           
              continue;//se for vogal continua a vertificacao
          }
           else 
           {
             return false;//se nao for vogal retorna falso
           }
        }
        return true;
    }
    public static boolean Consoante(String parametro)
    {
        
        for (int i = 0; i < parametro.length(); i++) 
        {
          char letra = parametro.charAt(i);
          
          if ((letra<= 'z' && letra >= 'a' ||
               letra<='Z' && letra >='A' ) &&//verifica se eh uma letra 
               letra != 'a' && letra != 'e' && letra != 'i' && letra != 'o' && letra != 'u' &&
				       letra != 'A' && letra != 'E' && letra != 'I' && letra != 'O' && letra != 'U')//verifica se nao e vogal 
                
          { 
              
              continue;//se for consoante continua a vertificacao
          }
           else 
           {
             return false;//se nao for consoante retorna falso
           }
        }
        return true;
    }
    public static boolean Inteiro(String parametro)
    {
        
        for (int i = 0; i < parametro.length(); i++) 
        {
          char letra = parametro.charAt(i);
          
          if (letra <= '9' && letra >= '0')
          {
            
              continue;//se for numero inteiro continua a vertificacao
          }
           else 
           {
             return false;//se nao for numero inteiro retorna falso
           }
        }
        return true;
    }
    public static boolean Real(String parametro)
    {
        boolean decimal = false;//variavel pra dectar pontuacao de decimal
        for (int i = 0; i < parametro.length(); i++) 
        {
          char letra = parametro.charAt(i);
          
          if (letra == '.' && !decimal)//se tiver ponto e decimal e continua
          {
            decimal = true;
            continue;
          }
          if (letra <= '9' && letra >= '0')
          {
              
              continue;//se for numero real continua a vertificacao
          }
           else 
           {
             return false;//se nao for numero real retorna falso
           }
        }
        return true;
    }

    public static void main(String[] args) 
    {
        String entrada;
        
        entrada = MyIO.readLine();
        

        while (!entrada.equals("FIM")) 
        {
          
            if (Vogal(entrada)) 
            
                MyIO.print("SIM ");
        
            else
				MyIO.print("NAO ");

            
             if (Consoante(entrada)) 
            
                MyIO.print("SIM ");
            
            else
				MyIO.print("NAO ");
            
             if (Inteiro(entrada)) 
            
                MyIO.print("SIM ");
            
            else
				MyIO.print("NAO ");
            
             if (Real(entrada)) 
            
                MyIO.print("SIM\n");
            
            else
				MyIO.print("NAO\n");
            
            entrada = MyIO.readLine();
        }
    }
}
