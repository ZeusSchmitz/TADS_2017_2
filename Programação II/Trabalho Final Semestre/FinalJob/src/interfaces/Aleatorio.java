package interfaces;

import finaljob.Contato;

public interface Aleatorio {
    public void inserir(Contato c);
    public String buscar(String nome);
    public void deletar(int id);
    public void alterar();
}
