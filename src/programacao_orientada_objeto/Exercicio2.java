 

package programacao_orientada_objeto;

/**
 *
 * @author Micah
 */

/*2. Identifique as classes e 
 * implemente um programa para a 
 * seguinte especificação: 
 * “O supermercado vende diferentes tipos de produtos. 
 * Cada produto tem um preço e uma quantidade em estoque.
 * Um pedido de um cliente é composto de itens, onde cada item especifica 
 * o produto que o cliente deseja e a respectiva quantidade.
 * Esse pedido pode ser pago em dinheiro, cheque ou cartão.”
 */
public class Exercicio2 {

    double preco;
    String quantidade;
    String pedido;

    public Exercicio2(double preco, String quantidade, String pedido) {
        this.preco = preco;
        this.quantidade = quantidade;
        this.pedido = pedido;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public String getPedido() {
        return pedido;
    }

    public void setPedido(String pedido) {
        this.pedido = pedido;
    }

    @Override
    public String toString() {
        return "Exercicio2{" + "preco=" + preco + ", quantidade=" + quantidade + ", pedido=" + pedido + '}';
    }

    public static void main(String[] args) {

    }
}
