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
public class Matriz {    
    int[][] minhaMatriz = new int[1000][1000];
    Random valorRandom = new Random();
    
    public Matriz(){
        for (int linha = 0; linha < minhaMatriz.length; linha++) {
            for (int coluna = 0; coluna < minhaMatriz[linha].length; coluna++) {
                minhaMatriz[linha][coluna] = valorRandom.nextInt(1,10);
            }
        }
    }
    
    public void imprimirMatriz(){
        for (int linha = 0; linha < minhaMatriz.length; linha++) {
            for (int coluna = 0; coluna < minhaMatriz[linha].length; coluna++) {
                System.out.print(minhaMatriz[linha][coluna] + " | ");
            }
            System.out.println("\n");
        }
    }
}
