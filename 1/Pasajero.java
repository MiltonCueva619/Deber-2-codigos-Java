
package com.mycompany.deber2;

import java.util.Scanner;

public class Pasajero extends Persona {
    public int id;    
    public Pasajero(){
        super();
        this.id = ingresarId();
    }
    public int ingresarId(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingreseel ID del pasajero");
        return scanner.nextInt();
    }
    public void pedirTaxi(){
        System.out.println( "esta pidiendo un taxi");
    }
    public void cancelarTaxi(){
        System.out.println( "cancelo el taxi");
    }
    @Override
    public void mostrarInformacion(){
    }    
}
