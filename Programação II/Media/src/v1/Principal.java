package v1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Diego
 */
public class Principal {
    public static void main(String[] args) {
        Aluno alu = new Aluno();
        
        alu.notas.setN1(5);
        alu.notas.setN2(8);
        alu.notas.setN3(7);
        alu.notas.setN4(9);
        
        System.out.println(alu.notas.calcMedia());
    }
    
}
