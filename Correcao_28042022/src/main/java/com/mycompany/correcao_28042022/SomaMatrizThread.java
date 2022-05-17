/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.correcao_28042022;

import java.time.LocalDateTime;
import java.util.Random;

/**
 *
 * @author Enza Rafaela
 */
public class SomaMatrizThread implements Runnable {   
    int[] linha = new int[1000];
    int numLinha;
    
    public SomaMatrizThread(int[] linha, int numLinha) {
        this.linha = linha;
        this.numLinha = numLinha;
    }
    
    // SEM THREAD
    public void somarLinha() {
        int soma = 0; 
        String strLinha= "";
        
        for (int coluna = 0; coluna < linha.length; coluna++) {
            soma += linha[coluna];
            strLinha = strLinha + linha[coluna] + " | ";
        }
        
        System.out.println("Soma linha " + this.numLinha  + "\n" + 
                           "---> Linha: " + strLinha + "\n" +
                           "---> START em: " + LocalDateTime.now() + "\n" +  
                           "---> Resultado: " + soma + "\n" ); 
        soma = 0;
    }
    
    // COM THREAD
    @Override
    public void run() {
        int soma = 0; 
        String strLinha= "";
        
        for (int coluna = 0; coluna < linha.length; coluna++) {
            soma += linha[coluna];
            strLinha = strLinha + linha[coluna] + " | ";
        }
        
        System.out.println("Soma linha " + this.numLinha  + "\n" + 
                           "---> Linha: " + strLinha + "\n" +
                           "---> START em: " + LocalDateTime.now() + "\n" +  
                           "---> Resultado: " + soma + "\n" ); 
        soma = 0;
    } 
    
    public static void main(String[] args) {
        Matriz minhaMatriz = new Matriz();
        
        // SEM THREAD       
        /* for (int linha = 0; linha < minhaMatriz.minhaMatriz.length; linha++) {
            SomaMatrizThread minhaThread = new SomaMatrizThread(minhaMatriz.minhaMatriz[linha], linha); 
            minhaThread.somarLinha();
                       
        } */
        
        // COM THREAD       
        for (int linha = 0; linha < minhaMatriz.minhaMatriz.length; linha++) {
            SomaMatrizThread minhaThread = new SomaMatrizThread(minhaMatriz.minhaMatriz[linha], linha); 
            
            Thread thread = new Thread(minhaThread);
            thread.start();            
        } 
        
    }
}
