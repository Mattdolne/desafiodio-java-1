package services;

import java.util.Scanner;
import java.util.Locale;

import model.DadosConta;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        
        System.out.println("Saudações! Este é o JavaBank. \n Por favor, digite o número da sua conta:");
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);
        int setNumero = scan.nextInt();
        scan.nextLine();
        
        System.out.println("Excelente! \nAgora, digite o número da sua agência:");
        String setAgencia = scan.nextLine();

        System.out.println("Correto! \nPreciso que insira o seu nome:");
        String setNomeCliente = scan.nextLine();

        System.out.println("Ótimo! \nPara concluir o seu cadastro, digite o saldo de depósito inicial:");
        double setSaldo = scan.nextDouble();
        
        DadosConta conta = new DadosConta();
        conta.setNumero(setNumero);
        conta.setAgencia(setAgencia);
        conta.setNomeCliente(setNomeCliente);
        conta.setSaldo(setSaldo);
        
        System.out.println(conta.contaCriada());
        
        System.out.println("Gostaria de acessar o Caixa Eletrônico agora?" +
            "\nDigite s ou n");
            scan.nextLine();
        String acessarCaixa = scan.nextLine();
            if (acessarCaixa.equalsIgnoreCase("s")) {
                CaixaEletronico caixa = new CaixaEletronico();
                caixa.iniciar(conta.getSaldo());
            } else {
                System.out.println("Encerrando o terminal...");
                System.exit(0);
            } 
        scan.close();
    }  
   
}
