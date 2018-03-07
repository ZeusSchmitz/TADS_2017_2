package GrafoNaoDirigido;

/**
 *
 * @author Diego
 */
public class Main {
    public static void main(String[] args) throws Exception{
        Grafo gra = new Grafo();
        gra.addNodo(1);
        gra.addNodo(2);
        gra.addNodo(3);
        gra.addNodo(4);
        gra.addNodo(5);
        
        gra.addAresta(1, 2);
        gra.addAresta(1, 3);
        gra.addAresta(1, 4);
        gra.addAresta(1, 5);
        gra.addAresta(5, 2);
//        gra.removeAresta(1, 5);
//        gra.removeNodo(1);
        gra.printAdjacentes();
    }
}
