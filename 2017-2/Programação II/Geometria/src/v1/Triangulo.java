package v1;

/**
 *
 * @author Diego
 */
public class Triangulo {
    
    Ponto p1 = null;
    Ponto p2 = null;
    Ponto p3 = null;
    double a, b, c;
    
    
    public Triangulo(double x1, double y1, double x2, double y2, double x3, double y3){
        this.p1 = new Ponto(x1, y1);
        this.p2 = new Ponto(x2, y2);
        this.p3 = new Ponto(x3, y3);
        a = p1.distancia(p2);
        b = p2.distancia(p3);
        c = p3.distancia(p1);
    }
    
    public double calcularArea() {
        double p = a + b + c;
        double s = p/2;
        
        return 0;
    }
    
    public String toString(){
       // String retorno;
        //retorno = "Coordenadas P1: " + p1[0] + p1[1];
        
        //return retorno;
    }
    
}
