package Banco;

import java.util.Random;

public class Conta {

    public Conta(Pessoa titular) {
        this.saldo = 0.0;
        this.titular = titular;
        this.numero = this.gerarNumeroConta();
    }
    private int numero;
    private double saldo;
    private Pessoa titular;
   
    public int getNumero(){
        return numero;
    } 
    public double getSaldo() {
        return saldo;
    }

    public Pessoa getTitular() {
        return titular;
    }
    
    public void sacar(double valor){
        if(valor <= this.saldo && valor > 0){
            this.saldo -= valor;
            System.out.printf(this.titular.getNome()+ "Saldo após depósito: R$%.2f", this.saldo);
            System.out.println("");
        }else{
            System.out.println("Valor Invalido ou insuficiente para saque!!");
        }
    }
   
    public void depositar(double valor){
        if(valor > 0){
            this.saldo += valor;
            System.out.printf(this.titular.getNome()+ "Saldo após depósito: R$%.2f", this.saldo);
        }else{
            System.out.println("Valor Invalido!!");
        }
    }
    
    public void transferir(Conta destinatario, double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
            destinatario.saldo += valor;
            System.out.printf(this.titular.getNome()+ "Saldo após depósito: R$%.2f", this.saldo);
            System.out.println("");
            System.out.printf(destinatario.getTitular().getNome()+ "Saldo após depósito: R$%.2f", destinatario.getSaldo());
            System.out.println("");
        }else{
            System.out.println("Saldo Insuficiente.");
        }
        
        
        
    }
    
    private int gerarNumeroConta() {
        Random random = new Random();
        return random.nextInt(90000) + 10000;
    }
    
    
    
}
