import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o comprimento do primeiro segmento: ");
        int a = scanner.nextInt();
        
        System.out.print("Digite o comprimento do segundo segmento: ");
        int b = scanner.nextInt();
        
        System.out.print("Digite o comprimento do terceiro segmento: ");
        int c = scanner.nextInt();
        
        if (a < b + c && b < a + c && c < a + b) {
            System.out.println("É possível formar um triângulo com esses segmentos.");
        } else {
            System.out.println("Não é possível formar um triângulo com esses segmentos.");
        }
        
        scanner.close();
    }
}
