package finaljob;

import java.io.File;
import java.io.RandomAccessFile;

/**
 *
 * @author Diego Armando Cacilha
 */
public class Aleatorio implements interfaces.Aleatorio {

    private RandomAccessFile file;
    private int id = 1;
    private RandomAccessFile temp;

    /**
     * Busca o ultimo ID inserido no arquivo txt
     */
    private void getId() {
        String[] arr = new String[3];
        String str = "";
        try {
            while (str != null) {
                str = this.file.readLine();
                if (str != null) {
                    arr = str.split(";");
                    if (Integer.parseInt(arr[2]) >= this.id) {
                        this.id = Integer.parseInt(arr[2]);
                        this.id++;
                    }
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
            this.temp = new RandomAccessFile(new File("./temp"), "rw");
            this.getId();
        } catch (Exception e) {
            System.out.println("Arquivo inexistente");
            System.out.println(e);
        }
    }

    /**
     * Insere um novo contato no arquivo txt
     *
     * @param nome Nome do contato
     * @param tel Telefone do contato
     */
    @Override
    public void inserirNoFinal(Contato c) {
        try {
            long l = file.length();
            this.file.seek(l);
            this.file.writeBytes(c.getNome().toUpperCase() + ";" + c.getTelefone() + ";" + this.id + "\n");
            id++;
        } catch (Exception e) {
            System.out.println("Arquivo não pode ser escrito!");
            System.out.println(e);
        }

    }

    @Override
    public String buscar(String nome) {
        String str = "";
        String[] arr = new String[3];
        nome = nome.toUpperCase();
        try {
            this.file.seek(0);
            while (str != null) {
                str = this.file.readLine();
                if (str != null) {
                    arr = str.split(";");
                }
                if (nome.equals(arr[0])) {
                    return str;
                }
            }
        } catch (Exception e) {
            System.out.println("Erro ao buscar contato");
            System.out.println(e);
        }
        return null;
    }

    @Override
    public void deletar(int id) throws Exception{
        String str;
        String[] arr;
        this.file.seek(0);
        this.temp.setLength(0);
        do {
            str = this.file.readLine();
            if (str != null) {
                arr = str.split(";");
                if (id != Integer.parseInt(arr[2])) {
                    temp.writeBytes(str + "\n");
                }
            }
        }while (str != null);
        str = "";
        this.file.setLength(0);
        this.temp.seek(0);
        do{
            str = this.temp.readLine();
            if(str != null) this.file.writeBytes(str + "\n");
        }while(str != null);

    }

    private void inserir(Contato c) {
        try {
            this.file.writeBytes(c.getNome().toUpperCase() + ";" + c.getTelefone() + ";" + this.id + "\n");
        } catch (Exception e) {
            System.out.println("Problema ao inserir contato");
            System.out.println(e);
        }
    }

    @Override
    public void alterar(int id, String nome, long tel) {
        String str = "";
        String[] arr = new String[3];
        try {
            this.file.seek(0);
            while (str != null) {
                str = this.file.readLine();
                if (str != null) {
                    arr = str.split(";");
                    if (id == Integer.parseInt(arr[2])) {
                        this.temp.writeBytes(nome + ";" + tel + ";" + id + "\n");
                    } else {
                        this.temp.writeBytes(str + "\n");
                    }
                }
            }
            str = "";
            this.temp.seek(0);
            this.file.setLength(0);//limpa o arquivo para poder ser regravado.
            do {
                str = temp.readLine();
                if (str != null) {
                    this.file.writeBytes(str.toUpperCase() + "\n");
                }
            } while (str != null);
        } catch (Exception e) {
            System.out.println("Problema para localizar contato");
            System.out.println(e);
        }
    }

}
