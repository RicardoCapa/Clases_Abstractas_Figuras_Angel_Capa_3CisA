/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

/**
 *
 * @author Capa Brothers
 */
public class Rectangulo extends Figuras {

    public double base;
    public double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area() {
        double result = base * altura;
        return result;
    }

    @Override
    public double perimetro() {
        double result = (base * 2) + (altura * 2);
        return result;
    }

}
