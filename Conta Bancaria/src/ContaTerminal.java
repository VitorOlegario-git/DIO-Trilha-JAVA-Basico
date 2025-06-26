import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Digite o número da agência:");
        String agencia = scanner.nextLine();

        System.out.println("Digite o número da sua conta:");
        int conta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Digite o saldo da sua conta:");
        String saldo = scanner.nextLine();

        System.out.printf("Olá %s, obrigado por criar conta em nosso banco. Sua agência é %s, conta %d e seu saldo R$ %s já está disponível para saque.%n",
        nome, agencia, conta, saldo); 

        scanner.close();
    }

}
