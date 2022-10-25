/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana13;

/**
 * Crear una lista de frutas(nombre, color)
 * @author chris
 */
class fruta{
    String name;
    String color;
    public fruta(String n, String c){
        this.name=n;
        this.color=c;
    }
    String informacion(){
        return "Nombre: "+this.name+" Color: "+this.color;
    }
}
class nodo{
    fruta dato;
    nodo sgte,ant;
    public nodo(fruta f){
        this.dato=f;
        this.ant=this.sgte=null;
    }
}
class metodo{
    nodo origen, fin;
    public metodo(){
        this.origen=this.fin=null;
    }
    void ingresar(fruta f){
        nodo newnodo=new nodo(f);        
        if(origen==null){            
            fin=origen=newnodo;
        }else{
                newnodo.sgte=origen;
                origen.ant=newnodo;
                origen=newnodo;
                }
    }
    void mostrarColo(){
        nodo temp=fin;
        while(temp!=null){
            System.out.println(temp.dato.informacion());
            temp=temp.ant;
        }
    }
}
public class ejer02 {
    public static void main(String[] args) {
        metodo m=new metodo();
        m.ingresar(new fruta("A","Red"));
        m.ingresar(new fruta("B","Blue"));
        m.ingresar(new fruta("C","Pink"));
        m.ingresar(new fruta("D","Green"));
        m.ingresar(new fruta("E","Black"));
        m.mostrarColo();
    }
}
