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
    public static void main(String[] args) throws Exception{
        Aleatorio al = new Aleatorio("./arquivo.txt");
        al.deletar(2);
        //al.reescrita();
        //al.alterar(1, "Diegooooo", 1111122222);
//        Contato c = new Contato("Gisele",3232);
//        al.inserirNoFinal(c);
    }

}
