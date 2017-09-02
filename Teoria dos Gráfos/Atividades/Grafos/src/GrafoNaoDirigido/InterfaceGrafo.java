/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GrafoNaoDirigido;

import java.util.Map;

/**
 *
 * @author Diego
 */
public interface InterfaceGrafo {
    /**
     * Imprime o grau do Nodo
     * @param id Identificação do Nodo
     */
    public void grau(int id);
    /**
     * Adiciona Vertex/Nodo
     * @param id Id do Nodo a ser inserido
     * @return Adicionado com sucesso
     */
    public boolean addNodo(int id);
    /**
     * Removo o Nodo indicado no parâmetro
     * @param id Identificação do Nodo
     * @return Removido com sucesso
     * @throws 
     */
    public boolean removeNodo(int id) throws Exception;
    public void addAresta(int idNodo1, int idNodo2) throws Exception;
    public void removeAresta(int no1, int no2);
    public int v();
    public int e();
    public int[] degreeSequenci();
    @Override
    public String toString();
    public boolean adjacent(int no1, int no2);
    public Map<Integer, Nodo> getNodos();
    public boolean isSimple();
    public boolean isRegular();
    public boolean isComplete();
    /**
     * Imprime no console os Nodos e seus adjacentes
     */
    public void printAdjacentes();
}
