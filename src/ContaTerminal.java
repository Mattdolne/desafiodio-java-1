import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {

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
        
        
        System.out.println(contaCriada(nomeCliente, agencia, numero, saldo));
        
        System.out.println("Gostaria de acessar o Caixa Eletrônico agora?" +
            "\nDigite s ou n");
            scan.nextLine();
        String acessarCaixa = scan.nextLine();
            if (acessarCaixa.equalsIgnoreCase("s")) {
                CaixaEletronico caixa = new CaixaEletronico();
                caixa.iniciar(saldo);
            } else {
                System.out.println("Encerrando o terminal...");
                System.exit(0);
            } 
        scan.close();
        }   
            
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

