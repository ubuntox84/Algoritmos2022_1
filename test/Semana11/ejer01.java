/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana11;

/**
 *
 * @author chris
 */
class metodo{
    // 4!=4*3*2*1*0!
    int factorial(int n){
        if(n==0){
            return 1;
        }else{
            return n*(factorial(n-1));
            //1- f(4)=4* f(3)---> 4*6=24
            //2- f(3)=3*f(2)---> 3*2=6
            //3- f(2)=2*f(1)---->2*1=2
            //4- f(1)=1*f(0)--->1*1=1
        }
    }
    int factorialIterativo(int n){
        int prod=1;
        for (int i = 1; i <= n; i++) {
            prod*=i;
        }
        return prod;
    }
}
public class ejer01 {
    public static void main(String[] args) {
        metodo m1=new metodo();
        System.out.println(m1.factorial(4));
        System.out.println(m1.factorialIterativo(4));
    }
}
