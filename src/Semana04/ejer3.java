/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana04;

import java.util.Scanner;

/**
 *
 * @author chris
 */
public class ejer3 {
    public static void main(String[] args) {
        int suma=0,n;
        int cont=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        n=sc.nextInt();
        while(cont!=n+1){
            suma+=cont;
            cont++;
        }
        System.out.println("La suma es: "+suma);
    }
}
