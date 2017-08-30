package GrafoNaoDirigido;

import java.util.HashMap;
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
}
