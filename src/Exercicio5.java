import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um valor: ");
        int valor = scanner.nextInt();
        
        if (valor > 100 && valor < 200) {
            System.out.println("O valor " + valor + " está no intervalo (100, 200).");
        } else {
            System.out.println("O valor " + valor + " não está no intervalo (100, 200).");
        }
        
        scanner.close();
    }
}
