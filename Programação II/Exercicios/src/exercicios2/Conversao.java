package exercicios2;

public class Conversao {
    
    public int toBin(int decimal){
        int temp;
        String resto = "";
        while(decimal >= 1){
            temp = decimal / 2;
            resto = decimal % 2 + resto;
            decimal = temp;
        }
        return Integer.parseInt(resto);
    }
    public int toDec(Integer binario){
        char[] temp = binario.toString().toCharArray();
        int cont = 1;
        int decimal = 0;
        for(int i = temp.length - 1; i >= 0; i--){
            if(temp[i] == '1')
                decimal += cont;
            cont *= 2;
        }
        return decimal;
    }
}
