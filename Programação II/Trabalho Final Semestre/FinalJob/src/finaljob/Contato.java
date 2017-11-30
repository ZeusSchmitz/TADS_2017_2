/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finaljob;

/**
 *
 * @author tads
 */
public class Contato {
    String nome;
     long telefone;
     int id;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Contato(String nome, long telefone, int id) {
        this.nome = nome;
        this.telefone = telefone;
        this.id = id;
    }
     
}
