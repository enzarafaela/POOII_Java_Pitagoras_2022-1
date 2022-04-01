
package Classes;

/**
 *
 * @author Enza Rafaela
 */
public class Calculadora {
    private int numeroA;
    private int numeroB;
    
    public int getNumeroA() {
        return numeroA;
    }

    public void setNumeroA(int numeroA) {
        this.numeroA = numeroA;
    }

    public int getNumeroB() {
        return numeroB;
    }

    public void setNumeroB(int numeroB) {
        this.numeroB = numeroB;
    }

    public int SomarNumeros(int numA, int numB){
        return (numA + numB);
    }
}
