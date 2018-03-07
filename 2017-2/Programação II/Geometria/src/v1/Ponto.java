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
public class Ponto {
    double x;
    double y;
    
    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public double distancia(Ponto p) {
        return Math.sqrt( (x-p.x)*(x-p.x) + (y-p.y)*(y-p.y));
    }
}
