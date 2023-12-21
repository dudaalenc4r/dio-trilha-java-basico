import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) {

        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Por favor, digite o Número da sua conta: ");
        int numero = scanner.nextInt();

        System.out.println("Agora digite o número da sua Agencia (somente números): ");
        int agencia = scanner.nextInt();

        System.out.println("Por favor, digite o saldo de sua conta: ");
        float saldo = scanner.nextFloat();

        System.out.println("Olá, " + nome + " " + "obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", " + "conta " + numero + ", " + "e seu saldo de " + saldo + " reais " + "já está disponível para saque");

    }
}
