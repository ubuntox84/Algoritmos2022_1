
package Semana02;

/**
 *
 * @author chris
 */
class Perro{
    String raza;
    String color;
    float peso;
    //constructor: inicializar las variables
    public Perro(){
        raza="";
        color="";
        peso=0f;
    }
    public Perro(String a){
        raza=a;
        color="";
        peso=0f;
    }
    public Perro(String a, String b){
        raza=a;
        color=b;
        peso=0f;
    }
    public Perro(String a, String b, float c){
        raza=a;
        color=b;
        peso=c;
    }
    void dormir(){
        
    }
    void comer(){
        
    }
    void ladral(){
        System.out.println("Hua hua hua");
    }
    void informacion(){
        System.out.println("Raza: "+this.raza+"\nColor: "
                +this.color+"\nPeso: "+this.peso);
    }
}
public class ejer01 {
    public static void main(String[] args) {
        //Creando mi primer objeto en Java
        Perro p=new Perro();
        Perro p1=new Perro("Boxer");
        Perro p2=new Perro("Chiwuawua","Blanco");
        Perro p3=new Perro("Pitbull","Marron",30);
        
        p3.informacion();
        p2.informacion();
        p1.informacion();
    }
}
