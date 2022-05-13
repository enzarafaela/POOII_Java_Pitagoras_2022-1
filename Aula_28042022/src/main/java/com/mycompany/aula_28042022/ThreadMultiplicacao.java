/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula_28042022;

/**
 *
 * @author Enza Rafaela
 */
public class ThreadMultiplicacao implements Runnable {

    /**
     * @return the primeiro
     */
    public long getPrimeiro() {
        return primeiro;
    }

    /**
     * @param primeiro the primeiro to set
     */
    public void setPrimeiro(long primeiro) {
        this.primeiro = primeiro;
    }

    /**
     * @return the segundo
     */
    public long getSegundo() {
        return segundo;
    }

    /**
     * @param segundo the segundo to set
     */
    public void setSegundo(long segundo) {
        this.segundo = segundo;
    }

    /**
     * @return the resultado
     */
    public long getResultado() {
        return resultado;
    }

    /**
     * @param resultado the resultado to set
     */
    public void setResultado(long resultado) {
        this.resultado = resultado;
    }
    
    private long primeiro;
    private long segundo;
    private long resultado;
    
    public ThreadMultiplicacao(long primeiro, long segundo) {
        this.primeiro = primeiro;
        this.segundo = segundo;
    }
    
    @Override
    public void run() {
        
        for (int contador1 = 0; contador1 < this.primeiro; contador1++)
            for (int contador2 = 0; contador2 < this.segundo; contador2++)
                this.resultado += 1; 
    }
}
