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
public class Triangulo extends Figuras {

    private double base;
    private double altura;

    @Override
    public double area() {
        double result = (base * altura) / 2;
        return result;
    }

    @Override
    public double perimetro() {
        double result = 3 * base;
        return result;
    }

}
