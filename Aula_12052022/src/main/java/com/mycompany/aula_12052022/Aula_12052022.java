/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.aula_12052022;

/**
 *
 * @author Enza Rafaela
 */
public class Aula_12052022 {

    public static void main(String[] args) {
        MongoConexao conexao = new MongoConexao();
        //conexao.inserirAluno("Diego", 23, "Ciencia da Computacao");
        //conexao.mostrarAluno();
        
        //conexao.alterarAluno("Diego", "Diego Ramiris");
        //conexao.removerAluno("Diego Ramiris");
        //conexao.mostrarAluno();
        
        conexao.mostrarAluno("Enza");
    }
}
