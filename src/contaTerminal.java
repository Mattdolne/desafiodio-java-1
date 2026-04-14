import java.util.Scanner;
import java.util.Locale;

public class contaTerminal {

    public static void main(String[] args) throws Exception {
        
        System.out.println("Saudações! Este é o JavaBank. \n Por favor, digite o número da sua conta:");
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);
        int numero = scan.nextInt();
        scan.nextLine();
        
        System.out.println("Excelente! \nAgora, digite o número da sua agência:");
        String agencia = scan.nextLine();

        System.out.println("Correto! \nPreciso que me insira o seu nome:");
        String nomeCliente = scan.nextLine();

        System.out.println("Ótimo! \nPara concluir o seu cadastro, digite o saldo de depósito inicial:");
        double saldo = scan.nextDouble();
        
        scan.close();

        System.out.println(contaCriada(nomeCliente, agencia, numero, saldo));
    }    //Exibir as mensagens para o usuário
       
        //Exibir mensagem conta criada
        public static String contaCriada(String nomeCliente, String agencia, int numero, double saldo) {
        return "Olá " + nomeCliente + "!" + 
        "\nEstamos contentes por ter se juntado a nós." +
        "\nSegue os dados da sua nova conta: " +
        "\nAgência: " + agencia +
        "\nNúmero da Conta: " + numero +
        "\nSaldo atual: " + saldo;
        }
        
}

