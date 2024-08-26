import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ler o valor
        System.out.print("Digite um valor: ");
        int valor = scanner.nextInt();

        // Verificar se o valor é maior que 100
        if (valor > 100) {
            System.out.println("O valor é maior que 100.");
        } else if (valor < 100) {
            System.out.println("O valor é menor que 100.");
        } else {
            System.out.println("O valor é igual a 100.");
        }

        scanner.close();
    }
}
