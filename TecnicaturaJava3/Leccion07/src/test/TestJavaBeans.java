
package test;

import domain.Persona;


public class TestJavaBeans {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Juan");
        persona.setApellido("Perez");
        System.out.println("Persona = " + persona);
        
        System.out.println("Persona Nombre = " + persona.getNombre());
        System.out.println("Persona Apellido = " + persona.getApellido());
    }
}
