public class Principal {

	public static void main(String args[]) {
		
		Bola b = new Bola(); // criar uma nova instância do objeto bola
		Jogador j = new Jogador(); // criar uma nova instância do objeto jogador
		
		b.moverPara(10, 11);
		b.r = 5;
		b.imprimirEstado();
		
		j.moverPara(-10, -20);
		j.r = 10;
		j.imprimirEstado();

		// condição!!! testar se ocorreu colisão:
		
		// descobrir a distancia entre os centros dos objetos
		
		double d = Math.sqrt( ((j.x - b.x) * (j.x - b.x)) + ((j.y - b.y)*(j.y-b.y)) );

		if ( d - (b.r + j.r) <= 0 ) {
			System.out.println("Ocorreu colisão");
		} else {
			System.out.println("Não ocorreu colisão");
		}

	}
}
