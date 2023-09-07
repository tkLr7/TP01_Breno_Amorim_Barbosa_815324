public class IsR
{
    public static boolean Vogal(String parametro, int i)
    {
      if (i == parametro.length()) {
       return true;
    }    
          char letra = parametro.charAt(i);
          
          if (letra == 'a' || letra == 'A'||//verifica se e vogal
              letra == 'e' || letra == 'E'|| 
              letra == 'i' || letra == 'I'||
              letra == 'o' || letra == 'O'|| 
              letra == 'u' || letra == 'U'
             ) 
          {
             return Vogal(parametro, i + 1);
          }
           else 
           {
             return false;//se nao for vogal retorna falso
           }
    }
    public static boolean Consoante(String parametro, int i)
    {
      if (i == parametro.length()) {
       return true;
    }
          char letra = parametro.charAt(i);
          
          if ((letra<= 'z' && letra >= 'a' ||
               letra<='Z' && letra >='A' ) &&//verifica se eh uma letra 
               letra != 'a' && letra != 'e' && letra != 'i' && letra != 'o' && letra != 'u' &&
				       letra != 'A' && letra != 'E' && letra != 'I' && letra != 'O' && letra != 'U')//verifica se nao e vogal 
                
          { 
            return Consoante(parametro, i + 1);
          }
           else 
           {
             return false;//se nao for consoante retorna falso
           }
    }
    public static boolean Inteiro(String parametro, int i)
    {
      if (i == parametro.length()) {
       return true;
    }  
        
          char letra = parametro.charAt(i);
          
          if (letra <= '9' && letra >= '0')
          {
            return Inteiro(parametro, i + 1);
          }
           else 
           {
             return false;//se nao for numero inteiro retorna falso
           }
        
    }
    public static boolean Real(String parametro, int i, boolean decimal)
    {
      if (i == parametro.length()) {
       return true;
    }  
         decimal = false;//variavel pra dectar pontuacao de decimal
        
          char letra = parametro.charAt(i);
          
          if (letra == '.' && !decimal)//se tiver ponto e decimal e continua
          {
            return Real(parametro, i + 1, decimal = true);
          }
          if (letra <= '9' && letra >= '0')
          {
            return Real(parametro, i + 1, decimal);
          }
           else 
           {
             return false;//se nao for numero real retorna falso
           }
    }

    public static void main(String[] args) 
    {
        String entrada;
        
        entrada = MyIO.readLine();
        

        while (!entrada.equals("FIM")) 
        {
          
            if (Vogal(entrada, 0)) 
            
                MyIO.print("SIM ");
        
            else
				MyIO.print("NAO ");

            
             if (Consoante(entrada, 0)) 
            
                MyIO.print("SIM ");
            
            else
				MyIO.print("NAO ");
            
             if (Inteiro(entrada, 0)) 
            
                MyIO.print("SIM ");
            
            else
				MyIO.print("NAO ");
            
             if (Real(entrada, 0, false)) 
            
                MyIO.print("SIM\n");
            
            else
				MyIO.print("NAO\n");
            
            entrada = MyIO.readLine();
        }
    }
}
