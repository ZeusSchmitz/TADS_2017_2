package finaljob;

import java.io.File;
import java.io.RandomAccessFile;

/**
 *
 * @author Diego Armando Cacilha
 */
public class Aleatorio {

    private RandomAccessFile file;
    private int id = 1;
    
    private void getId(){
        String[] arr = new String[3];
        String str = "";
        try {
            while (str != null) {
                str = this.file.readLine();
                if(str != null){
                    arr = str.split(";");
                    if(Integer.parseInt(arr[2]) >= this.id) {
                        this.id = Integer.parseInt(arr[2]);
                        this.id++;
                    }
                    System.out.println(this.id);
                }
            }
        } catch (Exception e) {
            System.out.println("Erro na leitura da linha");
            System.out.println(e);
        }
    }
    public Aleatorio(String caminho) {
        try {
            this.file = new RandomAccessFile(new File(caminho), "rw");
            this.getId();
        } catch (Exception e) {
            System.out.println("Arquivo inexistente");
            System.out.println(e);
        }
    }

    public void inserir(String nome, long tel) {
        try {
            long l = file.length();
            this.file.seek(l);
            this.file.writeBytes(nome+";"+tel+";"+this.id+"\n");
            id++;
        } catch (Exception e) {
            System.out.println("Arquivo não pode ser escrito!"); 
            System.out.println(e); 
        }

    }
    public void buscar(){
        
        
        
        
        
    }

}
