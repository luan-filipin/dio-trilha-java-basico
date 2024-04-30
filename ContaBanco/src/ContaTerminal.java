import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, informe o numero da Conta: ");
        numero = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Por favor, informe o numero da Agencia: ");
        agencia = scanner.nextLine();
      

        System.out.print("Por favor informe seu nome: ");
        nomeCliente = scanner.nextLine();

        System.out.print("Por favor, informe o saldo: ");
        saldo = scanner.nextDouble();

        scanner.close();
        
        System.out.println("Olá " + nomeCliente + ", obrigado por criar um conta em nosso banco, sua agencia é "+agencia+", conta "+numero+" e seu saldo é "+saldo+" ja esta disponivel para saque.");
    }
}
