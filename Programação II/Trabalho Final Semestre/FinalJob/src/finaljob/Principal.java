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

import java.util.Scanner;

/**
 * @author tads
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        Aleatorio al = new Aleatorio("./arquivo.txt");
        Scanner scan = new Scanner(System.in);
        int n = 0;
        String str = "";
        
        System.out.println("\n 1 - Lista \n 2 - Inserir \n 3 - Buscar \n 4 - Deletar \n 5 - Alterar \n 6 - Sair");
        do {
            System.out.println("Digite a opção: ");
            scan.hasNext();
            n = Integer.parseInt(scan.next());
            switch(n){
                case 1:{
                    System.out.println("Aqui");
                }
            }
        } while (n > 0);
        System.out.println("Fim");
        //al.reescrita();
        //al.alterar(1, "Diegooooo", 1111122222);
//        Contato c = new Contato("Gisele",3232);
//        al.inserirNoFinal(c);
    }

}
