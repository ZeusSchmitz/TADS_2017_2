package exercicios;

import java.util.Scanner;

public class Exercicios {

    public static void main(String[] args) {
        //1 - imprimir os 1000 primeiros números pares:
//        for(int i = 0; i < 1000; i++){
//            if( (i % 2) == 0 )
//                System.out.println(i);
//        }
        Scanner sc = new Scanner(System.in);
        System.out.println("informe um número: ");
        int numero = sc.nextInt();
        //2 - Leia um inteiro N, mostre os divisores de N:
//        for (int i = 1; i <= numero; i++){
//            if((numero % i) == 0)
//                System.out.println("Divisível por " + i);
//        }
        
        //3 - Leia um número P e informa se ele é primo ou não: 
        /*
        boolean primo = true;
        for(int i = 2; i < numero; i++){
            if((numero % i) == 0){
                primo = false;
                break;
            }
        }
        if(primo)
            System.out.println("É primo");
        else
            System.out.println("Não é primo");
        */
            
        //4 - Leia um número p, informe se p é um número perfeito;
        
    }
    
}
//5 - Encontre os 10000 primeiros números primos;
//6 - Crie um array A com 200 inteiros aleatórios;
//7 - Ordene o array A sem utilizar nenhuma biblioteca;
//8 - Procure em A um número B lido via teclado;
//9 - Crie um programa para sortear 10 números aleatórios;
//10 - Crie um array B com 300 inteiros aleatórios, inverta e imprima B;
//11 - Procure as reízes de ax² + bx + c, sem usar baskara;
//12 - Crie uma classe para representar matrizes, faça métodos para soma, subtração, e multiplicação;
//13 - Encontre uma apoximação para PI, a m elhor possível para vc;
//14 - Crie uma classe para representar inteiros de tamanho arbitrário, faça soma, subtração, multiplicação;
//15 - Verifique se uma palavra é palíndromo.