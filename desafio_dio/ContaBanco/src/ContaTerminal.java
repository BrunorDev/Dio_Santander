import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Por favor, digite o número da Agência:");
            String agencia = sc.nextLine();

            System.out.println("Informe seu nome e numero da conta:");
            String nome = sc.nextLine();
            int numero = sc.nextInt();
           

            System.out.println("Informe o saldo da conta:");
            double saldo = sc.nextDouble();

            System.out.println("Olá," + nome + ", obrigado por criar uma conta em nosso banco, sua agencia é " + agencia
                    + ", conta " + numero + " e seu saldo " + saldo + "já está disponivel para saque");

            System.out.println("Deseja continuar? (1 - sim) ou (4 - não):");
           int resposta = sc.nextInt();

            if (resposta == 4) {
                System.out.println("Saindo da conta");
                break;
            }


        }

        sc.close();
    }
}
