/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafos;

import java.util.ArrayList;

/**
 *
 * @author informatica
 */
public class Nodo {
    private int id;
    private ArrayList<Aresta> arestas = new ArrayList<>();
    
    public Nodo(int id){
        this.id = id;
    }
    public void addAresta(Aresta ar){
        boolean b = arestas.contains(ar);
        if(!b)
            arestas.add(ar);
        else 
            System.out.println("A aresta não pode ser adicionada novamente no mesmo nó");
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
