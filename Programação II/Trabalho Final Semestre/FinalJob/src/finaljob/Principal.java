/*
 * Arquivo de Acesso Sequencial: 
 * Append;
 * Buscar;
 * Atualizar;
 * 
 * Arquivo de Acesso Aleatório:
 * Inserir;
 * Buscar;
 * Deletar;
 * Alterar;
 */
package finaljob;

/** 
 * @author tads
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Aleatorio al = new Aleatorio("./arquivo.txt");
       al.inserir("Diegos", 99999999);
       
    }
    
}
