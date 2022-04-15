/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author Enza Rafaela
 */
public class ContaPoupanca extends Conta {
    public void FazerDeposito(double valorDeposito) {
        super.FazerDeposito(valorDeposito);
    }
    
    public void FazerSaque(double valorSque) {
        super.FazerSaque(valorSque, 10);
    }
}
