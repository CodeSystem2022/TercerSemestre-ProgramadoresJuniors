
package domain;


public class Persona {
    private final int idPersona;
    private static int contPersonas;
    
    static{//Bloque inicializacion estatico
        System.out.println("Ejecucion del bloque estatico");
        ++Persona.contPersonas;
        //id no es estatico asi que no va
    } 
    
    { //Bloque de inicialiazcion no estatico(contexto dinamico)
        System.out.println("Ejecucuion del bloque NO estatico");
        this.idPersona = Persona.contPersonas++; //incrementa el atributo
    }
    
    //Los bloques SIEMPRE van antes del constructor

    public Persona() {
        System.out.println("Ejecucion del constructor");
    }

    public int getIdPersona() {
        return this.idPersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + '}';
    }
    
    
    
    
    
}
