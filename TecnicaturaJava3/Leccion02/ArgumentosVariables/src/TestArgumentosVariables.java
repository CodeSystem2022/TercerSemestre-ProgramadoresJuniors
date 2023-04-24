
public class TestArgumentosVariables {

    public static void main(String[] args) {
        imprimirNumeros(3, 4, 5);
        imprimirNumeros(1, 2);
        variosParametros("Emir", "Viscio", 3, 5, 23);
    }

    private static void variosParametros(String nombre, String apellido, int... numeros) { //argumentos variables como parametro final
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        imprimirNumeros(numeros);
    }

    private static void imprimirNumeros(int... numeros) { // se convierte en array con cantidad indefinida, argumentos variados
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elementos: " + numeros[i]);
        }
    }

}
