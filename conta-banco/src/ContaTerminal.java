import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

		int numero;
		String agencia, nomeCliente;
		double saldo;

		System.out.println("Por favor, digite o número da Agência!");
		agencia = scanner.nextLine();
		
		System.out.println("Por favor, digite o seu Nome!");
		nomeCliente = scanner.nextLine();
		
		System.out.println("Por favor, digite o número de Usuário!");
		numero = scanner.nextInt();

		System.out.println("Por favor, digite o seu Saldo!");
		saldo = scanner.nextDouble();

        scanner.close();

		System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
				+ agencia + " , conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");


    }
}
