package GrafoNaoDirigido;

import java.util.LinkedList;

/**
 *
 * @author Diego
 */
public class Nodo implements InterfaceNodo{
    private LinkedList<Aresta> arestas = new LinkedList<Aresta>();
    private int id;
    
    public Nodo(int id){
        this.id = id;
    }
    private void imprime(){
        System.out.print("->" + this.id);
    }
    @Override
    public void imprimeAdjacentes(){
        arestas.forEach(a -> {
            a.getNodoOposto(this).imprime();
        });
        System.out.print("\n");
    }
    /**
     * 
     * @param aresta
     * @throws Exception se aresta já estiver no Nodo
     */
    @Override
    public void addAresta(Aresta aresta) throws Exception{
        if(!this.arestas.contains(aresta))
            this.arestas.add(aresta);
        else
            throw new Exception("Esta aresta já foi adicionada neste Nodo");
    }
    public int degree(){
        return this.arestas.size();
    }
    
    public LinkedList<Nodo> getAdjacentes(){
        LinkedList<Nodo> nosAdj = new LinkedList<>();
        this.arestas.forEach(a -> {
            nosAdj.add(a.getNodoOposto(this));
        });
        return nosAdj;
    }
    
    public boolean isAdjacente(Nodo no){
        for (int i = 0; i < arestas.size(); i++){
            if(arestas.get(i).contemNodo(no))
                return arestas.get(i).contemNodo(no);
        }
        return false;
    }

    public int getId() {
        return id;
    }

    public LinkedList<Aresta> getArestas() {
        return arestas;
    }

    @Override
    public boolean removeAresta(Aresta aresta) {
        if(arestas.contains(aresta))
            return this.arestas.remove(aresta);
        else
            return false;
    }
    
}
