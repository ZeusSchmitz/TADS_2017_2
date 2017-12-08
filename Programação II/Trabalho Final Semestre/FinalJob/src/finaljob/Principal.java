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
        
        do {
            System.out.print("\n 1 - Lista \n 2 - Inserir \n 3 - Buscar \n 4 - Deletar \n 5 - Alterar \n 0 - Sair \n");
            System.out.println("Digite a opção: ");
            scan.hasNext();
            n = Integer.parseInt(scan.next());
            switch(n){
                case 1:{
                    al.showContatos();
                    break;
                }
                case 2:{
                    System.out.println("Informe o nome do contato a ser inserido: ");
                    scan.hasNext();
                    String str = scan.next();
                    System.out.println("Informe o telefone do contato a ser inserido: ");
                    scan.hasNextInt();
                    int tel = Integer.parseInt(scan.next());
                    Contato c = new Contato(str, tel);
                    al.inserir(c);
                    break;
                }
                case 3:{
                    System.out.println("Informe o nome a ser buscado: ");
                    scan.hasNext();
                    String nome = scan.next();
                    System.out.println(al.buscar(nome).toString());
                    break;
                }
                case 4:{
                    System.out.println("Informe o ID do contato a ser excluído: ");
                    scan.hasNext();
                    int id = Integer.parseInt(scan.next());
                    al.deletar(id);
                    break;
                }
                case 5:{
                    System.out.println("Informe o ID do contato a ser alterado: ");
                    scan.hasNext();
                    int id = Integer.parseInt(scan.next());
                    System.out.println("Informe o novo nome para o contato: ");
                    scan.hasNext();
                    String str = scan.next();
                    System.out.println("Informe o novo telefone para o contato: ");
                    scan.hasNext();
                    long tel = Long.parseLong(scan.next());
                    al.alterar(id, str, tel);
                    break;
                }
            }
        } while (n > 0);
        System.out.println("Fim");
    }

}
