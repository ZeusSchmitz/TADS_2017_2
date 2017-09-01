package GrafoNaoDirigido;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 *
 * @author Diego
 */
public class Grafo {
    private Map<Integer, Nodo> nodos = new HashMap<>();
    
    public boolean addNodo(int id){
        if(nodos.containsKey(id))
            return false;
        else{
            nodos.put(id, new Nodo(id));
            return true;
        }
    }
    
    public void addAresta(int idNodo1, int idNodo2) throws Exception{
        Nodo no1;
        Nodo no2;
        if(nodos.containsKey(idNodo1) && nodos.containsKey(idNodo2)){
            no1 = nodos.get(idNodo1);
            no2 = nodos.get(idNodo2);
            
            Aresta ar = new Aresta(no1, no2);
            no1.addAresta(ar);
            if(!no1.equals(no2))
                no2.addAresta(ar);
        }else
            throw new Exception("Nodos não constam no grafo");
        
    }
    private void imprime(int i){
        System.out.print("Adjacente: "+ i + " > ");
    }
    public void printAdjacentes(int id){
        LinkedList<Nodo> lista = nodos.get(id).getAdjacentes();
        System.out.println("Nodo pai: " + nodos.get(id).getId());
        lista.forEach(a -> {
            this.imprime(a.getId());
        });
        System.out.print(" fim \n");
    }
}
