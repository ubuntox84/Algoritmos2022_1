package Semana11;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author chris
 */
class metodo{
    // 4!=4*3*2*1*0!
    int sumatoria(int n){
        if(n==0){
            return 0;
        }else{
            return n+(sumatoria(n-1));
        }
    }
    int sumatoriaIterativo(int n){
        int prod=0;
        for (int i = 1; i <= n; i++) {
            prod+=i;
        }
        return prod;
    }
}
public class eje02 {
    public static void main(String[] args) {
        metodo m1=new metodo();
        System.out.println(m1.sumatoria(5));
        System.out.println(m1.sumatoriaIterativo(5));
    }
}
