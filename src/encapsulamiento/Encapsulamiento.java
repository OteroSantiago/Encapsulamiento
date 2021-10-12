/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulamiento;
import dominio.Persona;
/**
 *
 * @author Santiago
 */
public class Encapsulamiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p1 = new Persona("Santiago",2000.00,false);
        
        p1.setNombre("Santiago Otero");
        
        
        System.out.println("Nombre de la persona 1: "+p1.getNombre());
        System.out.println("Sueldo de la persona 1: "+p1.getSueldo());
        System.out.println("Estado de la persona 1: "+p1.isEliminado());
        
        System.out.println("Persona 1: "+p1.toString());
    }
    
}
