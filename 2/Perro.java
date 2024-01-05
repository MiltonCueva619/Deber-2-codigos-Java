
package com.mycompany.codigonumero2;

public class Perro extends Animales {
    public String raza;
    
    public Perro (String nombre, int edad,String raza){
        super (nombre, edad);
        this.raza=raza;
    }
    
    public void correr (){
        System.out.println(nombre+" corre");
    }
    public void jugar(){
        System.out.println(nombre+" juego");
    }
    
    @Override
    public void hacerSonido() {
        System.out.println(nombre+" hace un sonido");
    }
      
}
