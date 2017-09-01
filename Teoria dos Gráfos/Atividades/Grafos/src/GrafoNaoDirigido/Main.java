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
        Grafo gra = new Grafo();
        gra.addNodo(1);
        gra.addNodo(2);
        gra.addNodo(3);
        gra.addNodo(4);
        gra.addNodo(5);
        
        gra.addAresta(1, 2);
        gra.addAresta(1, 3);
        gra.addAresta(1, 4);
        gra.addAresta(1, 5);
        gra.addAresta(5, 2);
        
        gra.printAdjacentes(5);
    }
}
