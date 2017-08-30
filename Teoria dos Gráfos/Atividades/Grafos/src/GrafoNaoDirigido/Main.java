/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GrafoNaoDirigido;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Diego
 */
public class Main {
    public static void main(String[] args) throws Exception{
        Nodo no1 = new Nodo(1);
        Nodo no2 = new Nodo(2);
        Aresta aresta = new Aresta();
        aresta.setnI(no1);
        aresta.setnJ(no2);
        no1.addAresta(aresta);
        no2.addAresta(aresta);
        
        
        System.out.println(no1.getAdjacentes().get(0).getId());
        
    }
}
