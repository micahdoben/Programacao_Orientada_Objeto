
package Exercicio4;

/**
 *
 * @author Micah
 */
public class Pessoa {
    private String nome;
    private int numBi;
    private int numTelefone;
    private String email;

    public Pessoa(String nome, int numBi, int numTelefone, String email) {
        this.nome = nome;
        this.numBi = numBi;
        this.numTelefone = numTelefone;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumBi() {
        return numBi;
    }

    public void setNumBi(int numBi) {
        this.numBi = numBi;
    }

    public int getNumTelefone() {
        return numTelefone;
    }

    public void setNumTelefone(int numTelefone) {
        this.numTelefone = numTelefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", numBi=" + numBi + ", numTelefone=" + numTelefone + ", email=" + email + '}';
    }
    
    
}
