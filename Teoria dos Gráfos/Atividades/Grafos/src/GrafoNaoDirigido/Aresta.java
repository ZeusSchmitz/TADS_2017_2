package GrafoNaoDirigido;

/**
 *
 * @author Diego
 */
public class Aresta {
    private Nodo nJ;
    private Nodo nI;

    public Aresta(){
        
    }
    public Aresta(Nodo no1, Nodo no2){
        nI = no1;
        nJ = no2;
    }
    
    public Nodo getnI() {
        return nI;
    }
    public Boolean contemNodo(Nodo no){
        return (nI.equals(no) || nJ.equals(no));
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
