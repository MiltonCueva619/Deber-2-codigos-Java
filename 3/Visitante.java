
package com.mycompany.persona;

public class Visitante extends Persona {
    public int carnet;
    
    public Visitante (String nombre, int edad, int ci,int carnet){
        super(nombre, edad, ci);
        this.carnet=carnet;
    }
     public void comprar (){
     System.out.println("Compra");
     }

}
