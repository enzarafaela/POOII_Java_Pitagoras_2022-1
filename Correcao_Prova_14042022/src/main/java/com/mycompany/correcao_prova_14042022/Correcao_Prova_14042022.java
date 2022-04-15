/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.correcao_prova_14042022;
import Matriz.Matriz;

/**
 *
 * @author Enza Rafaela
 */
public class Correcao_Prova_14042022 {

    public static void main(String[] args) {
        Matriz matriz   = new Matriz(3,3);
        Matriz nula     = new Matriz(3,3);
        Matriz oposta   = new Matriz(3,3);
        Matriz matriz02 = new Matriz(3,3);
        
        matriz.AlimentarMatriz();
        matriz.ImprimirMatriz();
        
        System.out.println("============");
        
        if (matriz.MatrizIdentidade()) 
            System.out.println("É identidade");
        else System.out.println("Não é identidade");        
                
        System.out.println("============");
        System.out.println("Oposta:");
        oposta.minhaMatriz = matriz.RetornarOposta();
        oposta.ImprimirMatriz();
                     
        System.out.println("============");
        System.out.println("Nula:");
        
        nula.minhaMatriz = matriz.RetornarNula();
        nula.ImprimirMatriz();
        
        System.out.println("============");
             
        if (nula.MatrizIdentidade()) 
            System.out.println("É identidade");
        else System.out.println("Não é identidade");        
        
        System.out.println("============");
        System.out.println("Soma:");
        
        matriz02.AlimentarMatriz();
        matriz.SomarMatrizes(matriz02.minhaMatriz);
        matriz.ImprimirMatriz();
        
        System.out.println("============");
        
    }
}
