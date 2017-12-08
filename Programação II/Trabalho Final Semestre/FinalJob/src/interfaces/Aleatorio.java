package interfaces;

import finaljob.Contato;

public interface Aleatorio{
    public void inserirNoFinal(Contato c);
    public String buscar(String nome);
    public void deletar(int id) throws Exception;
    public void alterar(int id, String novoNome, long novoTel);
}
