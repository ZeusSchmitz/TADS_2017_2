// uma classe para representar uma bola em um plano cartesiano
public class Bola {
	// aqui estão os meus estados do objeto
	int x; // atributo da posição x da bola
	int y; // atributo da posição y da bola
	int r; // raio da bola

	// aqui estão os meus métodos para modelar o comportamento

	// move a bola para a coordenada fornecida	
	void moverPara(int xx, int yy) {
		x = xx;
		y = yy;
	}

	void imprimirEstado() {
		System.out.println("Posição da bola: (" + x + ", " + y + "), raio: " + r);
	}
}

