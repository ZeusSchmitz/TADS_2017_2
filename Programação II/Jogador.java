// classe Jogador
public class Jogador {
	// aqui começam meus estados
	int x; // posição x do jogador
	int y; // posição y do jogador
	int r; // raio do jogador

	// método para mover o jogador
	public void moverPara(int xx, int yy) 
	{
		x = xx;
		y = yy;
	}

	void imprimirEstado() {
		System.out.println("Jogador, posição: (" + x + ", " + y + "), raio:" + r);
	}
}
