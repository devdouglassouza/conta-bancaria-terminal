import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // TODO: Conhecer e importar a classe Scanner

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Exibir as mensagens para o nosso usuário

        System.out.println("Digite seu nome");
        String nomeCliente = scanner.next();

        System.out.println("Digite seu sobrenome");
        String sobrenomeCliente = scanner.next();

        System.out.println("Digite sua agência");
        String agencia = scanner.next();

        System.out.println("Digite sua conta");
        int numero = scanner.nextInt();

        System.out.println("Digite seu saldo");
        double saldo = scanner.nextDouble();

        // Obter pelo scaner os valores digitados no terminal

        // Exibir a mensagem conta criada

        System.out.println(
                "Olá " + nomeCliente + " " + sobrenomeCliente
                        + ", obrigado por criar uma conta em nosso banco, sua agência é "
                        + agencia
                        + ", conta " + numero + " e seu saldo R$" + saldo + " já está disponível para saque.");

    }
}
