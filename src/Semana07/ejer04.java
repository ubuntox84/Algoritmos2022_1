/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana07;

/**
 *
 * @author chris
 */
interface DibujarFigura{
    void dibujar();
}
interface RotarFigura{
    void rotar();
}
interface calcularArea{
    double calArea();
}
class circulo implements DibujarFigura, calcularArea, RotarFigura{
    double r;
    public circulo(double r) {
        this.r = r;
    }    
    @Override
    public void rotar(){        
    }
    @Override
    public double calArea(){
        return 2*Math.PI*r*r;
    }
    @Override
    public void dibujar(){        
    }
}
class cuadrado implements DibujarFigura, calcularArea{
    double l;

    public cuadrado(double l) {
        this.l = l;
    }
    
    @Override
    public double calArea(){
        return l*l;
    }
    @Override
    public void dibujar(){
        
    }
}
public class ejer04{
    public static void main(String[] args) {
        circulo c1=new circulo(5);
        cuadrado ca1=new cuadrado(5);
        System.out.println("Area de circulo"+c1.calArea());
        System.out.println("Area de cuadrado"+ca1.calArea());
    }
}
