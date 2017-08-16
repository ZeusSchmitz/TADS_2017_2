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
    private Nodo vi;
    private Nodo vj;
    
    public Nodo getVi() {
        return vi;
    }

    public Nodo getVj() {
        return vj;
    }

    public void setVi(Nodo vi) {
        if(this.vi == null)
            this.vi = vi;
        else 
            System.out.println("Esta aresta já possui um Nodo vi");
    }

    public void setVj(Nodo vj) {
        if(this.vj == null)
            this.vj = vj;
        else 
            System.out.println("Esta aresta já possui um Nodo vj");
    }
}
