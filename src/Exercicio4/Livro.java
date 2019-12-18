
package Exercicio4;

/**
 *
 * @author Micah
 */
public class Livro {
   private String nomeAutor;
      private int edicao;
      private String titulo;

    public Livro(String nomeAutor, int edicao, String titulo) {
        this.nomeAutor = nomeAutor;
        this.edicao = edicao;
        this.titulo = titulo;
    }

    public Livro() {
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Livro{" + "nomeAutor=" + nomeAutor + ", edicao=" + edicao + ", titulo=" + titulo + '}';
    }
      
      
}
