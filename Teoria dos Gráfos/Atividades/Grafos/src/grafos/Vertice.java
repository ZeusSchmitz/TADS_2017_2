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
public class Vertice {
    private int id;
    
    public Vertice(int i){
        this.id = i;
    }
    
    public int getPonto() {
        return id;
    }

    public void setPonto(int ponto) {
        this.id = ponto;
    }
}
