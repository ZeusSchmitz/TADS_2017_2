/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafos;

/**
 *
 * @author informatica
 */
public class Aresta {
    private Vertice vi;
    private Vertice vj;
    
    public Aresta(int i, int j){
        this.vi = new Vertice(i);
        this.vj = new Vertice(j);
    }

    public int tamanhoAresta(){
        int temp;
        temp = vi.getPonto() - vj.getPonto();
        if(temp < 0) temp = temp * (-1);
        return temp;
    }
    public Vertice getVi() {
        return vi;
    }

    public Vertice getVj() {
        return vj;
    }

    public void setVi(Vertice vi) {
        this.vi = vi;
    }

    public void setVj(Vertice vj) {
        this.vj = vj;
    }
}
