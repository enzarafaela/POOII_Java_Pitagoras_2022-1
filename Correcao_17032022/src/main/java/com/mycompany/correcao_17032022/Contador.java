
package com.mycompany.correcao_17032022;

/**
 *
 * @author Enza Rafaela para Aula de POOO II em Java
 * 
 * Para teste no main:
 * 
        Contador contador = new Contador();
        
        System.out.println("Valor Retorno       : " + contador.Retornar());
        System.out.println("Valor Incrementado  : " + contador.Incrementar());
        System.out.println("Valor Retorno       : " + contador.Retornar());
        System.out.println("Valor Zerado        : " + contador.Zerar());
        System.out.println("Valor Retorno       : " + contador.Retornar());
 * 
 */
 class Contador { 
    private int contador;

    public int Zerar() { 
        this.contador = 0; 
        return contador; 
    }

    public int Incrementar() { 
        this.contador++; 
        return contador; 
    }

    public int Retornar() {
        return contador; 
    } 

}
