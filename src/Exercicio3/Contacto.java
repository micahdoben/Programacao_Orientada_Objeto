
package Exercicio3;

/**
 *
 * @author Micah
 */
public class Contacto {
   private String nome;
   private int numero;
   private String email;

    public Contacto(String nome, int numero, String email) {
        this.nome = nome;
        this.numero = numero;
        this.email = email;
    }

    public Contacto() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contacto{" + "nome=" + nome + ", numero=" + numero + ", email=" + email + '}';
    }
    
}
