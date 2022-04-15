/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author Enza Rafaela
 */
public class Conta {
    public int numeroConta;
    public String tipoConta;
    public double saldo;
    
    public void FazerDeposito(double valorDeposito) {
        this.saldo = this.saldo + valorDeposito;
    }
    
    public void FazerSaque(double valorSque, double taxa) {
        this.saldo = this.saldo - valorSque - (this.saldo * taxa / 100);
    }
}
