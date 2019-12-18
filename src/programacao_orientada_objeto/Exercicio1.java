package programacao_orientada_objeto;

import java.awt.BorderLayout;

/**
 *
 * @author Micah
 */
public class Exercicio1 {

    /*
    Crie uma classe Lâmpada cujos atributos são:
    cor, estado, tipo, voltagem, grau de luminosidade (de 0 a 100)
    a) Adicione os construtores necessários
    b) Adicione os getters e setters
    c) Adicione o método toString
    d) Adicione métodos para ligar, desligar a luz
    e) Adicione um método que mostre a mensagem “Luz Ligada” ou “Luz Desligada”. 
    f) Adicione um método que verifica se a lâmpada esta fundida 
    g) Adicione um método para verificar se 2 lâmpadas têm a mesma voltagem 
    h) Adicione um método que verifica se 2 lâmpadas são iguais 
    i) Adicione um método que aumente ou reduz o grau de luminosidade (de 5 em 
    j) Quando uma lâmpada ultrapassa o grau de luminosidade máximo (100) funde 
    (isto é, não pode ligar ou desligar mais).
     */

   
    public String cor;
    public String tipo;
    public boolean estado;
    public int voltagem;
    public int luminosidade;
    
    
    //a) Adicione os construtores necessários

    public Exercicio1(String cor, String tipo, boolean estado, int voltagem, int luminosidade) {
        this.cor = cor;
        this.tipo = tipo;
        this.estado = estado;
        this.voltagem = voltagem;
        this.luminosidade = luminosidade;
    }
//  b) Adicione os getters e setters
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }
    public int getLuminosidade() {
        return luminosidade;
    }

    public void setLuminosidade(int luminosidade) {
        this.luminosidade = luminosidade;
    }
    
    // c) Adicione o método toString

    @Override
    public String toString() {
        return "Exercicio1{" + "cor=" + cor + ", tipo=" + tipo + ", estado=" + estado + ", voltagem=" + voltagem + ", luminosidade=" + luminosidade + '}';
    }
    
    
    //d) Adicione métodos para ligar, desligar a luz
    public boolean ligada(){
        return true;
    }
    public boolean desligada(){
        return false;
    }
    
    /*e) Adicione um método que mostre a mensagem 
    “Luz Ligada” ou “Luz Desligada”. 
    */
    public void imprimir(){
        
       if(this.estado==true){
           System.out.println("luz ligada");
       }
           else{
            System.out.println("luz desligada");
       }
       
       }
    
    //f) Adicione um método que verifica se a lâmpada esta fundida
    public boolean fundida(){
        if(this.estado!=true && this.estado!=false){
            System.out.println("lampada esta fundida");
        }
        return true;  
    }
    
    //g) Adicione um método para verificar se 2 lâmpadas têm a mesma voltagem
    public void voltagem(){
        if(voltagem==2){
            System.out.println("duas lampadas tema mesma voltagem");
        }
    }
    // h) Adicione um método que verifica se 2 lâmpadas são iguais
    //identica
    
    //i) Adicione um método que aumente ou reduz o grau de luminosidade (de 5 em 
    //    (isto é, não pode ligar ou desligar mais).

    public static void main(String[] args) {

    }

}
