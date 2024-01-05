
package com.mycompany.codigonumero2;


public class Gato extends Animales {
    public String colorDePelo;
    
    public Gato(String nombre, int edad, String colorDePelo){
        super(nombre, edad);
        this.colorDePelo=colorDePelo;
    }
    public void treparArbol (){
         System.out.println(nombre+" trepa el arbol");
    }
    
    public void cazarRaton(){
        System.out.println(nombre+" cazo un raton");
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre+" hace un sonido");
    }
      

    
    
}
