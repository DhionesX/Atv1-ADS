import java.util.Scanner;

public class ativadade1 {
    public static void main(String[] args) {
        // (°F - 32) x 5/9 = °C
       final double FATOR = 5.0 / 9.0;
       final double AJUSTE = 32;
       Scanner entrada = new Scanner(System.in);

       System.out.print("Informe valor de fahrenheit: ");
       double fahrenheit = entrada.nextDouble();
       double celsius = (fahrenheit - AJUSTE) * FATOR;

       celsius = (fahrenheit - AJUSTE) * FATOR;

       System.out.println("Graus celsius:"+celsius+ "°C");

    }

}
