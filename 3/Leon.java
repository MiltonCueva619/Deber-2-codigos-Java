
package com.mycompany.persona;

public class Leon extends Zoo{
    public String vacuna;
    
    public Leon (String nombre, int edad, int registro, String vacuna){
        super(nombre, edad, registro);
        this.vacuna=vacuna;
    }
    public void rugir(){
        System.out.println(nombre + " el leon, esta rugiendo");
    }
    public void cazar(){
        System.out.println(nombre + " el leon, esta cazando");
    }
  
}
