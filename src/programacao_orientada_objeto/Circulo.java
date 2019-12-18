/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacao_orientada_objeto;

/**
 *
 * @author Micah
 */
public class Circulo {
    double raio;
    double x;
    double y;
    double pi;

    public Circulo(double raio, double x, double y, double pi) {
        this.raio = raio;
        this.x = x;
        this.y = y;
        this.pi = pi;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }
    
    
}
