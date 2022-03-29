
package com.mycompany.correcao_17032022;

/**
 *
 * @author Enza Rafaela para Aula de POOO II em Java
 * 
 * 
 * Para teste no main:
 * 
        Invoice invoice = new Invoice(3254, "Bala Halls", 5, 2);
        invoice.ValidatorQuantity();
        invoice.ValidatorPrice();

        System.out.println("Número do Ítem: " +invoice.getItemNumero());
        System.out.println("Descrição: " +invoice.getItemDescricao());
        System.out.println("Quantidade: " +invoice.getItemQuantidade());
        System.out.println("Preço: " +"R$"+invoice.getItemPreco());

        System.out.println("Preço Total Fatura: " +"R$"+invoice.getInvoiceAmount());
 * 
 * 
 */
 class Invoice { 
        
    private int ItemNumero;
    private String ItemDescricao;
    private int ItemQuantidade;
    private double ItemPreco;

    public Invoice(int itemNumero, String itemDescricao, int itemQuantidade, double itemPreco)
    {
        ItemNumero = itemNumero;
        ItemDescricao = itemDescricao;
        ItemQuantidade = itemQuantidade;
        ItemPreco = itemPreco;
    }

    public void ValidatorQuantity() {
        if (this.ItemQuantidade < 0) {
            this.ItemQuantidade = 0;
        }
    }

    public void ValidatorPrice() {
        if (this.ItemPreco < 0) {
            this.ItemPreco = 0;
        }
    }

    public void setItemNumero(int itemNumero) {
        this.ItemNumero = itemNumero;
    }

    public void setItemDescricao(String itemDescricao) {
        this.ItemDescricao = itemDescricao;
    }

    public void setItemQuantidade(int itemQuantidade) {
        this.ItemQuantidade = itemQuantidade;
    }

    public void setItemPreco(double itemPreco) {
        this.ItemPreco = itemPreco;
    }

    public int getItemNumero() {
        return this.ItemNumero;
    }

    public String getItemDescricao() {
        return this.ItemDescricao;
    }

    public int getItemQuantidade() {
        return this.ItemQuantidade;
    }

    public double getItemPreco() {
        return this.ItemPreco;
    }

    public double getInvoiceAmount() {
        return this.ItemPreco * this.ItemQuantidade;
    }
}
