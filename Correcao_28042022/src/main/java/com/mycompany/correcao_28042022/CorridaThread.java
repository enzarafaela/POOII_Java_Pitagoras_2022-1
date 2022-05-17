/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.correcao_28042022;

import java.time.LocalDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Enza Rafaela
 */
public class CorridaThread implements Runnable {
    long tempoVolta;
    int contadorVolta;
    String piloto;
    
    public CorridaThread(long tempoVolta, int contadorVolta, String piloto) {
        this.tempoVolta = tempoVolta;     
        this.contadorVolta = contadorVolta;
        this.piloto = piloto;
    }
    
    @Override
    public void run() {      
        System.out.println("VOLTA: " + this.contadorVolta  + "\n" + 
                           "---> Piloto: " + this.piloto + "\n" +              
                           "---> Tempo Volta: " + this.tempoVolta + '"' + "\n" ); 
    }
    
    public static void main(String[] args) throws InterruptedException {
        String pilotoThread01 = "", pilotoThread02 = "";
        long tempoThread01 = 0, tempoThread02 = 0;
        
        CarroCorrida carro01 = new CarroCorrida("Lewis Hamilton");
        CarroCorrida carro02 = new CarroCorrida("Fernando Alonso");
        
        for (int volta = 0; volta < 5; volta++) {
            carro01.marcarVolta(volta);
            carro02.marcarVolta(volta);
            
            // Controlando concorrencia sem sleep, sem setar prioridade, sem sincronização por meio dos métodos da própria
            // classe Thread, para entender o conceito de concorrencia.
            
            if (carro01.tempoVolta[volta] < carro02.tempoVolta[volta]) {
                pilotoThread01 =   carro01.piloto;
                pilotoThread02 =   carro02.piloto;
                tempoThread01  =   carro01.tempoVolta[volta];
                tempoThread02  =   carro02.tempoVolta[volta];
            }
            else {
                pilotoThread02 =   carro01.piloto;
                pilotoThread01 =   carro02.piloto;
                tempoThread02  =   carro01.tempoVolta[volta];
                tempoThread01  =   carro02.tempoVolta[volta];
            }
            
            CorridaThread minhaThread01 = new CorridaThread(tempoThread01, volta, pilotoThread01);             
            Thread thread01 = new Thread(minhaThread01);                                                                          
                
            thread01.start();
            while (thread01.isAlive()) {
                //System.out.println(pilotoThread01 + " correndo a volta " + volta);
            }
            
            // Só inicia a segunda quando a primeira acabar.
            // Ideal é que ambas iniciem juntas,porem, uma fique bloqueada
            CorridaThread minhaThread02 = new CorridaThread(tempoThread02, volta, pilotoThread02);             
            Thread thread02 = new Thread(minhaThread02);
            thread02.start(); 

            while (thread02.isAlive()) {
                //System.out.println(pilotoThread02 + " correndo a volta " + volta);
            }
        }
    }
}
