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
    
    /**
     * Busca o ultimo ID inserido no arquivo txt
     */
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
                    //System.out.println(this.id);
                }
            }
        } catch (Exception e) {
            System.out.println("Erro na leitura da linha");
            System.out.println(e);
        }
    }
    /**
     * Método construtor
     * 
     * @param caminho Local do arquivo
     */
    public Aleatorio(String caminho) {
        try {
            this.file = new RandomAccessFile(new File(caminho), "rw");
            this.getId();
        } catch (Exception e) {
            System.out.println("Arquivo inexistente");
            System.out.println(e);
        }
    }
    /**
     * Insere um novo contato no arquivo txt
     * @param nome Nome do contato
     * @param tel Telefone do contato
     */
    public void inserir(String nome, long tel) {
        try {
            long l = file.length();
            this.file.seek(l);
            this.file.writeBytes(nome.toUpperCase()+";"+tel+";"+this.id+"\n");
            id++;
        } catch (Exception e) {
            System.out.println("Arquivo não pode ser escrito!"); 
            System.out.println(e); 
        }

    }
    public String buscar(String nome){
        String str = "";
        String[] arr = new String[3];
        nome = nome.toUpperCase();
        try {
            this.file.seek(0);
            while(str != null){
                str = this.file.readLine();
                if (str != null) arr = str.split(";");
                if(nome.equals(arr[0]))
                    return str;
            }
        } catch (Exception e) {
            System.out.println("Erro ao buscar contato");
            System.out.println(e);
        }
        return null;
    }

}
