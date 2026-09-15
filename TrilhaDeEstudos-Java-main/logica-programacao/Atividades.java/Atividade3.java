import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
    
    System.out.println("Digite a nota do aluno:");
     double nota = scanner.nextDouble();

        if (nota >= 7 ) {
            System.out.println("Aprovado");
        } else if (nota >= 5 && nota < 7 ) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
    }

}
