import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nomeCliente = sc.nextLine();
        System.out.println("");

        System.out.println("Digite o Numero da Agência: ");
        int numeroDaConta = sc.nextInt();
        sc.nextLine();
        System.out.println("");

        System.out.println("Digite a Agência: ");
        String agencia = sc.nextLine();
        System.out.println("");

        System.out.println("Digite seu Saldo: ");
        double saldoDaConta = sc.nextDouble();

        System.out.println("Olá, " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroDaConta + " e seu saldo de " + saldoDaConta+ " já está disponível para saque" );
    }
}
