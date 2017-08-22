package grafos;

import java.util.ArrayList;

/**
 *
 * @author Diego Armando Cacilha
 */
public class Grafo {
    private ArrayList<Nodo> nodos = new ArrayList<>();

    public void removeNo(int id){
        ArrayList<Aresta> ar = new ArrayList<>();
        Nodo no = null;
        
        for(int i = 0; i < nodos.size(); i++){
            if(nodos.get(i).getId() == id){
                no = nodos.get(i);
                ar = no.getArestas();
            }
        }
        nodos.remove(no);
        for(int i = 0; i < ar.size(); i++){
            Nodo noTemp = ar.get(i).getOposto(no);
            noTemp.removeAresta(ar.get(i));
        }
    }
    public void getNodosAdjacentes(){
        for(int i = 0; i < nodos.size(); i++){
            System.out.println("Nó: " + nodos.get(i).getId());
            ArrayList<Aresta> ar = nodos.get(i).getArestas();
            for(int j = 0; j < ar.size(); j++){
                Nodo no = ar.get(j).getOposto(nodos.get(i));
                System.out.print("Nó adjacente: "+no.getId()+" | ");
            }
            System.out.println("\n");
        }
    }
    public void addNodo(int i){
        Nodo e = new Nodo(i);
        nodos.add(e);
    }
    public void addAresta(int id1, int id2){
        ArrayList<Nodo> nos = new ArrayList<>();
        Aresta ar = new Aresta();
        
        for(int i = 0; i < nodos.size(); i++){
            if(nodos.get(i).getId() == id1)
                nos.add(nodos.get(i));
            else if(nodos.get(i).getId() == id2)
                nos.add(nodos.get(i));
        }
        for(int i = 0; i < nos.size(); i++){
            ar.setNodo(nos.get(i));
            nos.get(i).addAresta(ar);
        }
    }
}
