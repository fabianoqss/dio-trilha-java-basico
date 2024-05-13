import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o numero da Conta !");
        int numeroConta = sc.nextInt();

        System.out.println("Por favor, digite o número da agência !");
        String numAgencia = sc.next();

        sc.nextLine();

        System.out.println("Por favor, digite o Nome do Cliente !");
        String nomeCliente = sc.nextLine();


        System.out.println("Por favor , digite o Saldo da Conta do Cliente !");
        double saldo = sc.nextDouble();

        System.out.println("Olá "
                + nomeCliente +
                ", obrigado por criar uma conta em nosso banco, sua agência é "
                + numAgencia +
                ", conta "
                + numeroConta +
                " e seu saldo "
                + saldo +
                " já está disponível para saque.");

    }
}