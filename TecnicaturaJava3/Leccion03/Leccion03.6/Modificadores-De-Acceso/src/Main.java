import Package1.Class1;
import Package1.SubClass2;
import Package2.Class3;
import Package1.Class2;
import Package2.Class4;

public class Main {
    public static void main(String[] args) {
        //En esta clase veremos modificadores de acceso:
        /*
        PUBLIC
        PROTECTED
        DEFAULT
        PRIVATE
         */

        //1. Comenzaremos con el public ya que nuestra clase test es public:
        Class1 class1 = new Class1();
        System.out.println("test.publicAtribute = " + class1.publicAtribute);
        class1.PublicMethod();

        //2. Ahora seguiremos con el modificador de acceso Protected:
        //para acceder a los metodos y atributos protected, debemos usar la clase hija, class3
        Class3 subClass = new Class3();
        System.out.println("subClass = " + subClass);

        //3. El default lo mostraremos en el archivo subClass2, y testDefault.
        SubClass2 subClass2 = new SubClass2();
        subClass2.PublicMethod();

        //4. Modificador de acceso privado:
        Class4 class4 = new Class4("Public");
        class4.SetPrivateAtribute("setter private atribute of class4");
        System.out.println("Class4 = " + class4.getPivateAtribute());
    }


}