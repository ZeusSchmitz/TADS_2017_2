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
public class Grafo {
    private ArrayList<Aresta> arestas = new ArrayList<>();

    public void addAresta(int i1, int i2){
        arestas.add(new Aresta(i1, i2));
    }

    public ArrayList<Aresta> getArestas() {
        return arestas;
    }
    
    public void tamanhoArestas(){
        arestas.forEach((a)->System.out.println(a.tamanhoAresta()));
        
    }
    
}
