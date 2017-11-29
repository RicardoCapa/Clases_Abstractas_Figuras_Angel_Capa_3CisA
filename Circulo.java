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
public class Circulo extends Figuras {

    public final double PI = 3.1416;
    private double radio;

    @Override
    public double area() {
        double result=PI*(Math.pow(radio,2));
        return result;
    }

    @Override
    public double perimetro() {
        double result=(2*PI)*radio;
        return result;
    }

}
