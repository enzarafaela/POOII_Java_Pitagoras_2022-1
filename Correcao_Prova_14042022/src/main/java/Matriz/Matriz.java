/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matriz;

/**
 *
 * @author Enza Rafaela
 */
public class Matriz {
    public int minhaMatriz[][];
    public int totalLinha, totalColuna;
    
    // * Forneça um construtor que permita a inicialização das dimensões da Matriz.
    public Matriz( int linhas, int colunas){
        totalLinha = linhas;
        totalColuna = colunas;
        minhaMatriz = new int[linhas][colunas];
    }
    
    //* Forneça métodos para acesso (leitura/escrita) de cada elemento da matriz.
    public void AlimentarMatriz() {
        for (int linhas = 0; linhas < totalLinha; linhas++)
            for (int colunas = 0; colunas < totalColuna; colunas++) {
                minhaMatriz[linhas][colunas] = 0; 
                if (linhas == colunas)
                    minhaMatriz[linhas][colunas] = 1; 
            }
    }
    
    public void ImprimirMatriz() {
        for (int linhas = 0; linhas < totalLinha; linhas++) {
            for (int colunas = 0; colunas < totalColuna; colunas++) {
                System.out.print(minhaMatriz[linhas][colunas]);
                
            }
            
            System.out.println("");
        }    
    }
    
    //* Retornar a oposta (é aquela onde todos os elementos possuem sinais trocados) da matriz;
    public int[][] RetornarOposta() {
        int[][] generic = new int[totalLinha][totalColuna];
        
       for (int linhas = 0; linhas < totalLinha; linhas++)
            for (int colunas = 0; colunas < totalColuna; colunas++) {
                generic[linhas][colunas] = minhaMatriz[linhas][colunas] * -1;                 
            } 
    
        return generic;
    }
    
    //* Retorne uma matriz nula (é aqueles onde todos os elementos são iguais a 0);
    public int[][] RetornarNula() {
        int[][] generic = new int[totalLinha][totalColuna];
        
       for (int linhas = 0; linhas < totalLinha; linhas++)
            for (int colunas = 0; colunas < totalColuna; colunas++) {
                generic[linhas][colunas] = 0;                 
            } 
    
        return generic;
    }
    
    //* Informe se a matriz é identidade 
    // (matriz onde os elementos da diagonal principal são todos iguais a 1 e os demais 0);
    
    public boolean MatrizIdentidade() {
        
        for (int linhas = 0; linhas < totalLinha; linhas++)
            for (int colunas = 0; colunas < totalColuna; colunas++) {
                if (linhas == colunas && minhaMatriz[linhas][colunas] != 1)
                    return false;
                if (linhas != colunas && minhaMatriz[linhas][colunas] != 0)
                    return false;
            } 
        
        return true;
    }
    
    //* Realize a soma de duas matrizes 
    //(passando a segunda matriz por parâmetro e alterando o valor da que recebeu a mensagem, ou seja, da que chamou o método);

    public void SomarMatrizes(int[][] matrizB) {
        for (int linhas = 0; linhas < totalLinha; linhas++)
            for (int colunas = 0; colunas < totalColuna; colunas++) {
                minhaMatriz[linhas][colunas] = minhaMatriz[linhas][colunas] + matrizB[linhas][colunas];                 
            }
    }
}
