/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GrafoNaoDirigido;

import java.util.LinkedList;

/**
 *
 * @author Diego
 */
public class Nodo {
    private LinkedList<Aresta> arestas = new LinkedList<Aresta>();
    private int id;
    
    public Nodo(int id){
        this.id = id;
    }
    
    public void addAresta(Aresta aresta) throws Exception{
        if(!this.arestas.contains(aresta))
            this.arestas.add(aresta);
        else
            throw new Exception("Esta aresta já foi adicionada");
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
    
    public boolean isAdjacente(int id){
        LinkedList<Nodo> adj = new LinkedList<>();
        LinkedList<Integer> ids = new LinkedList<>();
        adj.forEach(a -> {
            ids.add(a.getId());
        });
        return ids.contains(id);
    }

    public int getId() {
        return id;
    }
    
    
}
