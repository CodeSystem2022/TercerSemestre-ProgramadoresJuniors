
package test;

import static aritmetica.Aritmetica.division;
import excepciones.OperacionException;

public class TestExcepciones {
    public static void main(String[] args) {
        int resultado = 0;
        try{
            resultado = division(10, 0);
        } catch(OperacionException e){
            System.out.println("Error de tipo OperacionException");
            System.out.println(e.getMessage());
        } catch(Exception e){
            System.out.println("error");
            e.printStackTrace(System.out);
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Se revisó la división entre cero");
        }
        System.out.println("La variable resultado tiene como valor: "+ resultado);
    }
}
