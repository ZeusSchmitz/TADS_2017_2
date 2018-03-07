/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package v1;

/**
 *
 * @author informatica
 */
public class Notas {
    private float n1, n2, n3, n4;
    
    public float calcMedia(){
        float media;
        
        media = (n1 + n2 + n3 + n4) / 4;
        return media;
    }

    public float getN1() {
        return n1;
    }

    public float getN2() {
        return n2;
    }

    public float getN3() {
        return n3;
    }

    public float getN4() {
        return n4;
    }

    public void setN1(float n1) {
        this.n1 = n1;
    }

    public void setN2(float n2) {
        this.n2 = n2;
    }

    public void setN3(float n3) {
        this.n3 = n3;
    }

    public void setN4(float n4) {
        this.n4 = n4;
    }
}
