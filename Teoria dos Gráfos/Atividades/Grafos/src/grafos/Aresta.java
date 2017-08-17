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
    private Nodo no1;
    private Nodo no2;
    
    public Nodo getOposto(Nodo no){
        if(!no.equals(no2))
            return no2;
        else if(!no.equals(no1)){
            return no1;
        }else 
            return null;
    }
    
    public Nodo getNo1() {
        return no1;
    }

    public Nodo getNo2() {
        return no2;
    }
    
    public void setNodo(Nodo no) {
        if(this.no1 == null)
            this.no1 = no;
        else if(this.no2 == null)
            this.no2 = no;
        else
            System.out.println("Esta aresta já possui dois Nós");
    }
}
