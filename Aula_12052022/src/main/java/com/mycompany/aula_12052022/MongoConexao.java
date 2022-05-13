/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula_12052022;
import com.mongodb.MongoClient;
import com.mongodb.client.*;
import static com.mongodb.client.model.Filters.*;
import org.bson.Document;

/**
 *
 * @author Enza Rafaela
 */
public class MongoConexao {
    private MongoClient mongoClient;
    private MongoDatabase mongoDatabase;
    private MongoCollection<Document> collection;
    
    public MongoConexao() {
       mongoClient = new MongoClient("localhost", 27017);
       mongoDatabase = mongoClient.getDatabase("bancoteste");
       collection = mongoDatabase.getCollection("alunos");
    }
    
    public void inserirAluno(String nome, int idade, String curso) {
        Document doc = new Document("nome", nome).append("idade", idade).append("curso", curso);
        collection.insertOne(doc);
    }
    
    public void mostrarAluno(String nome){
        MongoCursor<Document> dados = collection.find().iterator();
        //MongoCursor<Document> dados = collection.find(eq("nome", nome)).iterator(); 
        
        try {
            while (dados.hasNext()) {
                Document atual = dados.next();
                System.out.println("================");
                System.out.println(atual.get("_id"));
                System.out.println(atual.get("nome"));
                System.out.println(atual.get("idade"));
                System.out.println(atual.get("curso"));
            }
        }
        finally {
            dados.close();
        }
        
    }
    
    public void alterarAluno(String nomeAntigo, String nomeAtual){
        // eq = 
        // ne <>
        // gt >
        // gte >=
        // lt <
        // lte <=
        collection.updateOne(eq("nome", nomeAntigo), new Document("$set", new Document("nome", nomeAtual)));
        
    }
    
    public void removerAluno(String nome) {
        collection.deleteOne(eq("nome", nome));
    }
}
