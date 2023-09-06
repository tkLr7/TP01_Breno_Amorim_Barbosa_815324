import java.io.IOException;
import java.io.RandomAccessFile;

public class File {
    public static void main(String[] args) 
    {
        int tamanho;
        double valor;
        tamanho = MyIO.readInt();
        try
        {
            RandomAccessFile file = new RandomAccessFile("Numeros.txt", "rw");//abre arquivo pra gravacao
            
            for (int j = 0; j < tamanho; j++) 
        {
            valor = MyIO.readDouble();
            file.writeDouble(valor);//grava valores double       
        }
        file.close();
            RandomAccessFile File = new RandomAccessFile ("Numeros.txt", "r");//abre arquivo pra leitura
            
            for (int i = 0; i < tamanho; i++) 
        {
            long grande = (tamanho*8) - (i*8) - 8;//variavel para guardar(em bytes) a posicao que a funcao seek deve comecar a ler o arquivo
            File.seek(grande);
            valor = File.readDouble();//grava os valores lidos em valor
            if (valor % 1 ==0) 
            {
                MyIO.println((int)valor);    
            }
            else
            {
                MyIO.println(valor);
                File.seek(File.getFilePointer() - 16);//volta o cursor de escrita/leitura pro comeco do numero decimal
            }
        }
        File.close();
        } catch (IOException x){}
    }
}