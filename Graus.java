import java.util.Scanner;

import javax.sql.rowset.spi.SyncResolver;

public class Graus {
    public static void main(String[] args) {
        
    
    final double AJUSTE = 32;
    System.out.print("Informe valor de celsius: ");
    Scanner entrada = new Scanner(System.in);
    
    double celsius = entrada.nextDouble();
    
    
    double fahrenheit = celsius * 1.8 + AJUSTE;

    System.out.println("Graus fahrenheit:"+fahrenheit+ "°F");

 }
}

 

