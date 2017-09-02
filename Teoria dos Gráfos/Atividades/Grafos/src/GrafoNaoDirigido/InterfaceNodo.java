/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GrafoNaoDirigido;

/**
 *
 * @author Diego
 */
public interface InterfaceNodo {
    /**
     * Adiciona a aresta ao Nodo
     * @param aresta Aresta a ser adicionado
     * @throws Exception
     */
    public void addAresta(Aresta aresta) throws Exception;
    public void imprimeAdjacentes();
    public boolean removeAresta(Aresta aresta);
}
