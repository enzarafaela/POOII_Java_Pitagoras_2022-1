
package com.mycompany.correcao_17032022;

/**
 *
 * @author Enza Rafaela
 * Para Aula de POOO II em Java
 * 
 */
public class JogodaVelha {
    public static final int linhasTotais = 3;
    public static final int colunasTotais = 3;
    
    public static final String flagJogadorA = "X"; //  1
    public static final String flagJogadorB = "O"; // -1
    
    public static final int jogadorA =  1;
    public static final int jogadorB = -1;
    
    int meuTabuleiro[ ][ ] = new int[linhasTotais][colunasTotais];
    int jogadorVez = 0;
    boolean jogoAberto = false;
    
    public JogodaVelha(){
        setFinalizarJogo();
    }
    
    public void setFinalizarJogo(){
        this.jogoAberto = false;
    }
    
    public void setInicializarJogo(){
        this.jogoAberto = true;
        setJogadorVez();
    }
    
    public void setInicializarTabuleiro(){
        if (!this.jogoAberto) {
            for (int linha = 0; linha < linhasTotais; linha++) {
                for (int coluna = 0; coluna < colunasTotais; coluna++) {
                    meuTabuleiro[linha][coluna] = 0;
                }
            }
            
            setInicializarJogo();
        }           
    }
    
    public void getMostrarTabuleiro(){
        if (getChecarJogoAberto()) {            
            System.out.println("===========================================");

            for (int linha = 0; linha < linhasTotais; linha++) {
                for (int coluna = 0; coluna < colunasTotais; coluna++) {
                    System.out.print("|");

                    if (meuTabuleiro[linha][coluna] == 0)
                        System.out.print(" ");
                    else if (meuTabuleiro[linha][coluna] == jogadorA)
                        System.out.print(flagJogadorA);
                    else 
                        System.out.print(flagJogadorB);
                }
                System.out.println("|");

            }
            
            System.out.println("===========================================");
        }        
    }
    
    public void setJogadorVez() {        
        if (jogadorVez == jogadorA) jogadorVez = jogadorB;
            else if (jogadorVez == jogadorB || jogadorVez == 0) jogadorVez = jogadorA;
    }
    
    public boolean getValidarCoordenadas(int linha, int coluna){
        if (linha + 1 > linhasTotais || coluna + 1 > colunasTotais) {
            System.out.println("Coordenadas inválidas. Tente novamente");
            return false;
        }    
        
        return true;
    }
    
    public boolean getChecarJogoAberto(){
        if (!this.jogoAberto) {
            System.out.println("Não há jogo em aberto! ");
            return false;
        }
                
        return true; 
    }
    
    public boolean getPosicaoOcupada(int linha, int coluna){
        if (meuTabuleiro[linha][coluna] != 0) {
            System.out.println("Posição ocupada! Tente novamente");
            setJogadorVez();
            return true;
        }
        
        return false; 
    }
    
    public void setJogada(int linha, int coluna) {
        if (getChecarJogoAberto()) {
            if (getValidarCoordenadas(linha, coluna)) {   
                
                if (!getPosicaoOcupada(linha, coluna)) {
                    meuTabuleiro[linha][coluna] = jogadorVez;
                    getChecarVencedor();
                }
                
                if (jogoAberto) {
                    setJogadorVez();
                    getMostrarTabuleiro();    
                }
            }
        }        
    }
    
    public void getChecarLinhas(){                                       
        for (int linha = 0; linha < linhasTotais; linha++) {                       
            int resultado = meuTabuleiro[linha][0] + meuTabuleiro[linha][1] + meuTabuleiro[linha][2];  
            
            if (resultado == 3 || resultado == -3) {
               System.out.println("Jogador " + (jogadorVez == jogadorA ? flagJogadorA : flagJogadorB) + " venceu! Jogo finalizado! ");
               getMostrarTabuleiro();
               jogoAberto = false;
            }
        }
    }
    
    public void getChecarColunas(){
        for (int coluna = 0; coluna < 3; coluna++) {                       
            int resultado = meuTabuleiro[0][coluna] + meuTabuleiro[1][coluna] + meuTabuleiro[2][coluna];
            
            if (resultado == 3 || resultado == -3) {
               System.out.println("Jogador " + (jogadorVez == jogadorA ? flagJogadorA : flagJogadorB) + " venceu! Jogo finalizado! ");
               getMostrarTabuleiro(); 
               jogoAberto = false;
            }
            
        }
    }
    
    public void getChecarDiagonais(){    
        int resultadoDiagA = meuTabuleiro[0][0] + meuTabuleiro[1][1] + meuTabuleiro[2][2];
        int resultadoDiagB = meuTabuleiro[0][2] + meuTabuleiro[1][1] + meuTabuleiro[2][0];
        
        if (resultadoDiagA == 3 || resultadoDiagA == -3 || resultadoDiagB == 3 || resultadoDiagB == -3) {
           System.out.println("Jogador " + (jogadorVez == jogadorA ? flagJogadorA : flagJogadorB) + " venceu! Jogo finalizado! ");
           getMostrarTabuleiro(); 
           jogoAberto = false;
        }
        
    }
    
    public void getChecarVencedor(){
        if (getChecarJogoAberto()) {
            getChecarLinhas();
            getChecarColunas();
            getChecarDiagonais();
        }        
    }
}
