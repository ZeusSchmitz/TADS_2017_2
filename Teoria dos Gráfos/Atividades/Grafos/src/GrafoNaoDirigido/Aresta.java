package GrafoNaoDirigido;

import GrafoNaoDirigido.Interfaces.InterfaceAresta;

/**
 *
 * @author Diego
 */
public class Aresta implements InterfaceAresta{
    private Nodo nJ;
    private Nodo nI;

    public Aresta(){
        
    }
    public Aresta(Nodo no1, Nodo no2){
        nI = no1;
        nJ = no2;
    }
    @Override
    public Nodo getNi() {
        return nI;
    }
    @Override
    public Boolean contemNodo(Nodo no) {
        return (nI.equals(no) || nJ.equals(no));
    }
    @Override
    public void addNo(Nodo no) {
        if(!no.equals(nJ) && nJ == null)
            this.nJ = no;
        else if(!no.equals(nI) && nI == null)
            this.nI = no;
    }
    @Override
    public Nodo getNodoOposto(Nodo no) {
        if(no.equals(nJ)){
            return nI;
        }else if(no.equals(nI)){
            return nJ;
        }
        return null;
        
    }
    @Override
    public Nodo getNj() {
        return nJ;
    }
    @Override
    public void setNi(Nodo nI) {
        this.nI = nI;
    }
    @Override
    public void setNj(Nodo nJ) {
        this.nJ = nJ;
    }
}
