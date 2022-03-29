
package com.mycompany.correcao_17032022;

/**
 *
 * @author Enza Rafaela para Aula de POOO II em Java
 * 
 * Para teste no main:
 * 
        Empregado empregado = new Empregado("Enza", "Rafaela", 1000);
        empregado.salarioValidator();
        System.out.println("Número Completo:      =>  " + empregado.getPrimeiroNome() + " "+ empregado.getSobrenome());
        System.out.println("Salário Anual:        =>  " +"R$"+empregado.getSalarioAnual());
        System.out.println("Salário Anual + 10%:  =>  " +"R$"+empregado.getSalarioAnualComAcrescimo());

        System.out.println("-----------------------------------");

        Empregado empregado2 = new Empregado("Moreli", "William", 5000);
        empregado2.salarioValidator();
        System.out.println("Número Completo:      =>  " +empregado2.getPrimeiroNome() + " "+ empregado2.getSobrenome());
        System.out.println("Salário Anual:        =>  " +   "R$"+empregado2.getSalarioAnual());
        System.out.println("Salário Anual + 10%:  =>  " +"R$"+empregado2.getSalarioAnualComAcrescimo());
 * 
 * 
 * 
 */
class Empregado { 

    private String PrimeiroNome;   
    private String Sobrenome;
    private double SalarioMensal;

    public Empregado(String primeiroNome, String sobrenome, double salarioMensal)
    {
        PrimeiroNome = primeiroNome;
        Sobrenome = sobrenome;
        SalarioMensal = salarioMensal;
    }

    public void salarioValidator () {
        if (this.SalarioMensal < 0) {
            this.SalarioMensal = 0;
        }
    }


    public void setPrimeiroNome(String primeiroNome) {
        this.PrimeiroNome = primeiroNome;
    }

    public void setSobrenome(String sobrenome) {
        this.Sobrenome = sobrenome;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.SalarioMensal = salarioMensal ;
    }
    
    public double getSalarioAnual() {
        return (this.SalarioMensal * 12) ;
    }
    
    public double getSalarioAnualComAcrescimo() {
        return this.SalarioMensal * 1.1 * 12 ;
    }

    public String getPrimeiroNome() {
        return this.PrimeiroNome;
    }
    
    public String getSobrenome() {
        return Sobrenome;
    }

    public double getSalarioMensal() {
        return SalarioMensal;
    }
}