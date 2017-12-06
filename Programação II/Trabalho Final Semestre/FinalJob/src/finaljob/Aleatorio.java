package finaljob;

import java.io.File;
import java.io.RandomAccessFile;

/**
 *
 * @author Diego Armando Cacilha
 */
public class Aleatorio implements interfaces.Aleatorio{

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
    @Override
    public void inserirNoFinal(Contato c) {
        try {
            long l = file.length();
            this.file.seek(l);
            this.file.writeBytes(c.getNome().toUpperCase()+";"+c.getTelefone()+";"+this.id+"\n");
            id++;
        } catch (Exception e) {
            System.out.println("Arquivo não pode ser escrito!"); 
            System.out.println(e); 
        }

    }
    @Override 
    public String buscar(String nome){
        String str = "";
        String[] arr = new String[3];
        nome = nome.toUpperCase();
        try {
            this.file.seek(0);
            while(str != null){
                str = this.file.readLine();
                if (str != null) arr = str.split(";");
                if(nome.equals(arr[0])) return str;
            }
        } catch (Exception e) {
            System.out.println("Erro ao buscar contato");
            System.out.println(e);
        }
        return null;
    }
    @Override
    public void deletar(int id){
        
    }
    private void inserir(Contato c){
        try {
            this.file.writeBytes(c.getNome().toUpperCase()+";"+c.getTelefone()+";"+this.id+"\n"); 
        } catch (Exception e) {
            System.out.println("Problema ao inserir contato");
            System.out.println(e);
        }
    }
    @Override
    public void alterar(int id, String nome, long tel){
        try {
            RandomAccessFile temp = new RandomAccessFile(new File("./temp.txt"), "rw");
        } catch (Exception e) {
            System.out.println("Problemas com o arquivo temporário");
            System.out.println(e);
        }
        String str = "";
        String[] arr = new String[3];
        Contato c = new Contato(nome, tel);
        try {
            this.file.seek(0);
            while(str != null){
                str = this.file.readLine();
                if (str != null) arr = str.split(";");
                if(id == Integer.parseInt(arr[2])){
                    this.file.seek(this.file.getFilePointer() - str.length()-1);
                    this.inserir(c);
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Problema para localizar contato");
            System.out.println(e);
        }
    }

}
