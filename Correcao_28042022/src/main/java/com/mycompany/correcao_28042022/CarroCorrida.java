/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.correcao_28042022;

import java.util.Random;

/**
 *
 * @author Enza Rafaela
 */

public class CarroCorrida {
    long tempoAcumulado; // vamos assumir que sejam segundos
    long[] tempoVolta = new long[5];
    String piloto;
    
    public CarroCorrida(String nome) {        
        piloto = nome;
        
        for (int volta = 0; volta < 5; volta++) {
            Random valorRandom = new Random();
            this.tempoVolta[volta] = valorRandom.nextInt(1,100);
            this.tempoAcumulado += this.tempoVolta[volta];
        }
    }
    
    public void marcarVolta(int volta) {
        Random valorRandom = new Random();
        this.tempoVolta[volta] = valorRandom.nextInt(1,100);
        this.tempoAcumulado += this.tempoVolta[volta];
    }
}
