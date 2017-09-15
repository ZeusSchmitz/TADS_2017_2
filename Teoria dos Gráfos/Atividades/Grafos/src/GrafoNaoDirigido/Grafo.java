package GrafoNaoDirigido;

import GrafoNaoDirigido.Interfaces.InterfaceGrafo;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 *
 * @author Diego
 */
public class Grafo implements InterfaceGrafo{
    private Map<Integer, Nodo> nodos = new HashMap<>();
    
    @Override
    public boolean addNodo(int id){
        if(nodos.containsKey(id))
            return false;
        else{
            nodos.put(id, new Nodo(id));
            return true;
        }
    }
    /**
     * @throws Exception Se Nodo não existir
     */
    @Override
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
    @Override
    public void removeAresta(int no1, int no2){
        Nodo noI = nodos.get(no1);
        Nodo noJ = nodos.get(no2);
        LinkedList<Aresta> arestas = noI.getArestas();
        for (int i = 0; i < arestas.size(); i++){
            if(noJ.getArestas().contains(arestas.get(i))){
                noJ.removeAresta(arestas.get(i));
                noI.removeAresta(arestas.get(i));
            }
        }
    }
    /**
     *
     * @throws Exception Se Nodo informado não existir
     */
    @Override
    public boolean removeNodo(int id) throws Exception{
        Nodo no = null;
        if(nodos.containsKey(id)){
            no = nodos.remove(id);
            LinkedList<Aresta> aresta = no.getArestas();
            for(int i = 0; i < aresta.size(); i++){
                Nodo noOposto = aresta.get(i).getNodoOposto(no);
                noOposto.removeAresta(aresta.get(i));
            }
            
        }else
            throw new Exception("O Nodo informado não existe");
        
        return (no != null);
    }
    @Override
    public void printAdjacentes(){
        this.nodos.forEach((a, b) -> {
            System.out.print(b.getId());
            b.imprimeAdjacentes();
        });
    }
    
    @Override
    public void grau(int id){
//        this.grau(id);
    }

    @Override
    public int v() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int e() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int[] degreeSequenci() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean adjacent(int no1, int no2) {
        return nodos.get(no1).isAdjacente(nodos.get(no2));
    }

    @Override
    public Map<Integer, Nodo> getNodos() {
        return this.nodos;
    }

    @Override
    public boolean isSimple() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isRegular() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isComplete() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
