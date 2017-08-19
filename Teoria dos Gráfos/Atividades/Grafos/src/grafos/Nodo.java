package grafos;

import java.util.ArrayList;

/**
 *
 * @author Diego Armando Cacilha
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

    public ArrayList<Aresta> getArestas() {
        return arestas;
    }
    
    @Override
    public String toString(){
        String str = "";
        for(int id = 0; id < arestas.size(); id++){
            Nodo noVi = arestas.get(id).getNo1();
            Nodo noVj = arestas.get(id).getNo2();
            str += "Id Vi: "+ noVi.getId() + " | Id Vj: " + noVj.getId() + " |\n";
        }
        return "\nArestas: \n"+str;
    }
    
}
