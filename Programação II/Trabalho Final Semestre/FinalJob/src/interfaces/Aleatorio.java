package interfaces;

import finaljob.Contato;

public interface Aleatorio{
    public void inserir(Contato c);
    public Contato buscar(String nome) throws Exception;
    public void deletar(int id) throws Exception;
    public void alterar(int id, String novoNome, long novoTel);
}
