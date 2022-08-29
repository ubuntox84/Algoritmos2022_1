/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana04;

/**
 *
 * @author chris
 */
interface constante{
    int n=5;
}
class fruta{
    private String name;
    private float price;
    public fruta(String n, float p){
        this.name=n;
        this.price=p;
    }
    String informacion(){
        return "Nombre: "+this.name+" Precio: "+this.price;
    }
}
class Canasta implements constante{
    fruta lista[]=new fruta[n];
    int cont=0;
    void llenar(fruta p){
        lista[cont]=p;
        cont++;
    }
    void mostrar(){
        int i=0;
        do{
            System.out.println(lista[i].informacion());
            i++;
        }while(cont!=i);
    }

}
public class ejer8 {
    public static void main(String[] args) {
        Canasta canasta1=new Canasta();
        canasta1.llenar(new fruta("Plantano 3x1",1.5f));
        canasta1.llenar(new fruta("Mazana 1K",5));
        canasta1.llenar(new fruta("Mango 1K",8));
        canasta1.llenar(new fruta("Uva 1K",6));
        canasta1.mostrar();
    }
}
