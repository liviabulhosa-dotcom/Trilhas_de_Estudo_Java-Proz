
import java.util.Scanner;

public class Atividades2 {
    
public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
    
    System.out.println("Digite um  numero:");
     int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("negativo");
        } else if (numero > 0) {
            System.out.println("positivo");
        } else {
            System.out.println("zero");
        }
    }

}

