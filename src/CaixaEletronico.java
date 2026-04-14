import java.util.Scanner;
import java.util.Locale;

public class CaixaEletronico {
private double saldo;


    public void iniciar(double saldoInicial) {
        this.saldo = saldoInicial;
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);
        int opcaoMenuCaixa = 0;

        while (opcaoMenuCaixa != 4) {
        System.out.println("Iniciando sistema de Caixa Eletrônico...");
        System.out.println("Digite o número da opção que deseja executar: " +
        "\n1 - Saldo" +
        "\n2 - Saque" +
        "\n3 - Depósito" +
        "\n4 - Sair"
    );
        opcaoMenuCaixa = scan.nextInt();

        
        switch (opcaoMenuCaixa) {
            case 1:
                exibirSaldo();
                break;
            case 2:
                saque();
                break;
            case 3:
                deposito();
                break;
            case 4:
                System.out.println("Encerrando o terminal. Até logo!");
                System.exit(0);
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
                break;
        }
       
        }

        }
        
        public void exibirSaldo() {
            System.out.println("Seu saldo atual é de: R$" + saldo);
        }
        
        public double saque() {
            System.out.println("Digite o valor que deseja sacar:");
            Scanner scan = new Scanner(System.in);
            scan.useLocale(Locale.US);
            double valorSaque = scan.nextDouble();
                if(this.saldo >= valorSaque) {
                   this.saldo -= valorSaque;
                   System.out.println("Saque realizado com sucesso! Seu novo saldo é de: R$" + saldo);
                } else {
                    System.out.println("Saldo insuficiente.");
                }
                return saldo;
        }
        
        public double deposito() {
            System.out.println("Digite o valor que deseja depositar:");
            Scanner scan = new Scanner(System.in);
            scan.useLocale(Locale.US);
            double valorDeposito = scan.nextDouble();
            this.saldo += valorDeposito;
            System.out.println("Depósito realizado com sucesso! Seu novo saldo é de: R$" + saldo);
            return saldo;   
        }
        
}
