package grafos;

import java.util.Locale;

public class Principal {

    public static void main(String[] args) {
        Grafo gra = new Grafo();
        
        gra.addAresta(1, 10);
        gra.addAresta(10, 15);
        gra.addAresta(15, 22);
        gra.tamanhoArestas();
        System.out.println(gra.getArestas());
    }
    
}
