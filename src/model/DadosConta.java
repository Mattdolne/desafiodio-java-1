package model;

public class DadosConta {
    
    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;
    
    public int getNumero() {
        return numero;
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //métodos
    public String contaCriada() {
    return "Olá " + this.nomeCliente + "!" + 
    "\nEstamos contentes por ter se juntado a nós." +
    "\nSegue os dados da sua nova conta: " +
    "\nAgência: " + this.agencia +
    "\nNúmero da Conta: " + this.numero +
    "\nSaldo atual: " + this.saldo;    
    }
    
}
