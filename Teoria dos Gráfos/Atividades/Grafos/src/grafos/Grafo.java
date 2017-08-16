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
    private ArrayList<Nodo> nodos = new ArrayList<>();

    public void addNodo(int i){
        Nodo e = new Nodo(i);
        nodos.add(e);
    }
    public void addAresta(int id1, int id2){
        
    }
}
