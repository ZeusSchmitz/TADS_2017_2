/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

/**
 *
 * @author tads
 */
public class Aleatorio {

    RandomAccessFile file;
    int id = 0;
    private void getId(){
        
    }
    public Aleatorio(String caminho) {
        try {
            this.file = new RandomAccessFile(new File(caminho), "rw");
        } catch (Exception e) {
            System.out.println("Arquivo inexistente");
            System.out.println(e);
        }
        try {
            this.file.seek(file.length()-2);
            
        } catch (Exception e) {
            System.out.println("aqui");
        }
        try {
            System.out.println("a" + this.file.readChar());
            //System.out.println(this.file.readByte());
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void inserir(String nome, long tel) {
        try {
            long l = file.length();
            this.file.seek(l);
            this.file.writeBytes(nome+";"+tel+";"+this.id+"\n");
            id++;
        } catch (Exception e) {
            System.out.println("Arquivo não pode ser escrito!"); 
            System.out.println(e); 
        }

    }
    public void buscar(){
        
        
        
        
        
    }

}
