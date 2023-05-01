public class Main {
    public static void main(String[] args) {
      //Clases envolventes o Wrappers
        /*
        Clases envolventes tipos primitivos:
        int = clase envolvente es Integer
        long = clase envolvente es Long
        float = clase envolvente es Float
        double = clase envolvente es Double
        boolean = clase envolvente es Boolean
        short = clase envolvente es Short
        byte = clase envolvente es Byte
        char = clase envolvente es Character
        */

        int enteroPrimitivo = 10; //tipo primitivo.
        System.out.println("Entero Primitivo = " + enteroPrimitivo);
        Integer enteros = 12; // tipo object con la clase integer
        System.out.println("Entero Object = " + enteros.toString());
        System.out.println("Entero Object = " + enteros.byteValue());
        System.out.println("Entero Object = " + enteros.shortValue());

    }
}