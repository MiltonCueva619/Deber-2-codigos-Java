
package com.mycompany.persona;

public abstract class Zoo {
    public String nombre;
    public int edad;
    private int registro;
    
    public Zoo (String nombre, int edad, int registro){
        this.nombre= nombre;
        this.edad=edad;
        this.registro=registro;
    }
    
    public void setRegistro (int registro){
        this.registro=registro;

    }
    public int getRegistro (){
        return registro;
    }
    
    public void comer(){
        System.out.println(nombre + " esta comiendo");
    }
    public void dormir(){
        System.out.println(nombre + " esta durmiendo");
    }
}
