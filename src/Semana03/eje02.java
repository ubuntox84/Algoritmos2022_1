/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana03;

import javax.swing.JOptionPane;

/**
 *
 * @author chris
 */
public class eje02 {
    public static void main(String[] args) {
        int a,b,sum;
        a=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor para A"));
        b=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor para B"));
        sum=a+b;
        JOptionPane.showMessageDialog(null, "La suma es "+a+" + "+b+" es igual "+sum);
    }
}
