
package com.mycompany.deber2;
public class Main {
    public static void main(String[] args){
        Pasajero cliente = new Pasajero ();
        System.out.println("Nombre del pasajero:"+ cliente.nombre);
        System.out.println("Edad del pasajero:"+ cliente.edad);
        System.out.println("Cedula del pasajero:"+ cliente.getCedula());
        
        Chofer taxista = new Chofer ();
        System.out.println("Nombre del chofer:"+ taxista.nombre);
        System.out.println("Edad del chofer:"+ taxista.edad);
        System.out.println("Cedula del chofer:"+ taxista.getCedula());

    } 
}
