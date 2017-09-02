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
     */
    public boolean removeNodo(int id) throws Exception;
    /**
     * Adiciona uma nova Aresta ao Grafo. Os Nodos devem existir antes de 
     * adicionar a nova Aresta.
     * @param idNodo1 Id do Nodo que recebe a nova Aresta
     * @param idNodo2 Id do Nodo que recebe a nova Aresta
     * @throws Exception
     */
    public void addAresta(int idNodo1, int idNodo2) throws Exception;
    /**
     * Remove a Aresta que liga os dois Nodos
     * @param no1 Id do Nodo
     * @param no2 Id do Nodo
     */
    public void removeAresta(int no1, int no2);
    public int v();
    public int e();
    public int[] degreeSequenci();
    /**
     * Verifica se Nodos são adjacentes
     * @param no1 Id Nodo
     * @param no2 Id Nodo
     * @return Verdadeiro se for adjacente
     */
    public boolean adjacent(int no1, int no2);
    /**
     * Retorna uma lista com os Nodos
     * @return Map<I, A> de Nodos
     */
    public Map<Integer, Nodo> getNodos();
    public boolean isSimple();
    public boolean isRegular();
    public boolean isComplete();
    /**
     * Usei este método ao invés do toString.
     * Imprime os Nodos e seu adjacentes.
     */
    public void printAdjacentes();
}
