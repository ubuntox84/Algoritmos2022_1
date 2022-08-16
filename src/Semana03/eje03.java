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
public class eje03 {
    public static void main(String[] args) {
        int num, sum=0;
        boolean band=true;
        int op;
        while(band){
            num=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
            sum=sum+num;      // sum+=num;
            op=JOptionPane.showConfirmDialog(null, "¿Sea continuar?", "Alerta!",JOptionPane.YES_NO_OPTION);
            if(op==1)band=false;
        }
        JOptionPane.showMessageDialog(null, "La sumatoria es "+sum);
        
    } 
}
