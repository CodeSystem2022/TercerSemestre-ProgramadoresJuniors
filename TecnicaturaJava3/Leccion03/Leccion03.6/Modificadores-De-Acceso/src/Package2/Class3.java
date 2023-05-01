package Package2;

import Package1.Class1;

public class Class3 extends Class1 {
public Class3(){
    super("protected");
    this.protectedAtribute = "Accedemos desde la clase hija";
    this.ProtectedMethod();
    System.out.println("Protected Atribute = " + this.protectedAtribute);
    this.publicAtribute = "is public";

}
}
