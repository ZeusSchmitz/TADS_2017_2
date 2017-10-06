package exercicios2;

/*Exercícios em sala
1 - Faça um programa para converter um número de base 2 para base 10
2 - Faça um programa para converter um número da base 10 para base 2
3 - Faça um programa para desenhar uma matriz. Exemplo: 
x 0 0 0 x
0 x 0 x 0 
0 0 x 0 0
0 x 0 x 0
x 0 0 0 x 
4 - Faça um programa para multiplicar matrizes M x N e N x M
5 - Gere um calendário de qualquer ano. Formate a saída para parecer com o calendário do comando cal do Unix 
*/
public class Main {
    public static void main(String[] args) {
        Conversao con = new Conversao();
        System.out.println(con.toDec(1010010));
    }
}
