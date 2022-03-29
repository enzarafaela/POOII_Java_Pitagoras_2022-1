

package com.mycompany.correcao_17032022;
import java.util.Scanner;

/**
 *
 * @author Enza Rafaela
 * Para Aula de POOO II em Java
 * 
 */
public class Correcao_17032022 {

    public static void main(String[] args) {       
        Scanner scanner = new Scanner(System.in); 
        
        JogodaVelha jogodaVelha = new JogodaVelha();        
        jogodaVelha.setInicializarTabuleiro();
        jogodaVelha.getMostrarTabuleiro();
        
        while (jogodaVelha.jogoAberto) {
            System.out.println("JOGADOR " + 
                               (jogodaVelha.jogadorVez == JogodaVelha.jogadorA ? jogodaVelha.flagJogadorA : jogodaVelha.flagJogadorB) + 
                               " Digite a [linha] da jogada:"); 
            int linha = scanner.nextInt();
            
            System.out.println("Digite a [coluna] da jogada:");
            int coluna = scanner.nextInt();
            
            jogodaVelha.setJogada(linha, coluna);       
        }
    }
}
