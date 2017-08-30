package GrafoNaoDirigido;

/**
 *
 * @author Diego
 */
public class Aresta {
    private Nodo nJ;
    private Nodo nI;

    public Nodo getnI() {
        return nI;
    }
    
    public void addNo(Nodo no){
        if(!no.equals(nJ) && nJ == null)
            this.nJ = no;
        else if(!no.equals(nI) && nI == null)
            this.nI = no;
    }
    public Nodo getNodoOposto(Nodo no){
        if(no.equals(nJ)){
            return nI;
        }else if(no.equals(nI)){
            return nJ;
        }
        return null;
    }
    public Nodo getnJ() {
        return nJ;
    }

    public void setnI(Nodo nI) {
        this.nI = nI;
    }

    public void setnJ(Nodo nJ) {
        this.nJ = nJ;
    }
}
