import java.sql.Time;
import java.util.Date;
import java.util.Scanner;
import javax.xml.crypto.Data;

public class ProvaEder2 {

    
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Date datAtu = new Date();
        
        System.out.print("informe o dia de nascimento: ");
        String dia = teclado.next();
        
        System.out.print("informe o mês de nascimento: ");
        String mes = teclado.next();
        
        System.out.print("informe o ano de nascimento: ");
        String ano = teclado.next();
        Date nascimento = new Date(mes+"/"+dia+"/"+ano);
        
        
        
        if (nascimento.getYear() > datAtu.getYear()) {
            System.out.println("O ano é futuro");
        } 
        else 
            if (nascimento.getYear() == datAtu.getYear() && nascimento.getMonth() > datAtu.getMonth()) {
                System.out.println("O mês é futuro");
            } 
            else 
                if (nascimento.getYear() == datAtu.getYear() && nascimento.getMonth() == datAtu.getMonth() 
                    && nascimento.getDate() > datAtu.getDate()) 
                {
                    System.out.println("O dia é futuro");
                }
                else 
                    if(nascimento.getDate() == datAtu.getDate() && nascimento.getMonth() == datAtu.getMonth()){
                        System.out.println("Parabéns! Hoje é seu " + (datAtu.getYear() - nascimento.getYear()) + "º aniversário.");
                    }
                    else 
                        if(nascimento.getMonth() > datAtu.getMonth()){
                            System.out.println("Pessoa com " + (datAtu.getYear() - nascimento.getYear() - 1) + " anos.");
                        }
                        else 
                            if (nascimento.getMonth() == datAtu.getMonth() && nascimento.getDate() > datAtu.getDate()){
                                System.out.println("Pessoa com " + (datAtu.getYear() - nascimento.getYear()-1) + " anos.");
                            }
                            else 
                                if (nascimento.getMonth() <= datAtu.getMonth() && nascimento.getDate() < datAtu.getMonth())
                                    System.out.println("Pessoa com " + (datAtu.getYear() - nascimento.getYear()) + " anos.");
    
    }
    
}
