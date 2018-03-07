/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GrafoNaoDirigido.Interfaces;

import GrafoNaoDirigido.Nodo;

/**
 *
 * @author Diego Armando Cacilha
 */
public interface InterfaceAresta {
    public Nodo getNi();
    public Nodo getNj();
    public Boolean contemNodo(Nodo no);
    public void addNo(Nodo no);
    public void setNi(Nodo nI);
    public void setNj(Nodo nJ);
    public Nodo getNodoOposto(Nodo no);
    
}
