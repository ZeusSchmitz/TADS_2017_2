package grafos;

import java.util.Locale;

public class Principal {

    public static void main(String[] args) {
        Grafo gra = new Grafo();
        gra.addNodo(2);
        gra.addNodo(1);
        gra.addNodo(3);
        gra.addNodo(4);
        
        gra.addAresta(1, 2);
        gra.addAresta(1, 3);
        gra.addAresta(1, 4);
        gra.addAresta(1, 4);
        gra.addAresta(2, 3);
        
        
        gra.getNodosAdjacentes();
    }
    
}
