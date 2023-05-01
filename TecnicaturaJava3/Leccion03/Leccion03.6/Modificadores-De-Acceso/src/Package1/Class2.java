package Package1;

public class Class2 extends Class1{
    String DefaultAtribute = "this is a default atribute";
    /*
    Class2(){
        System.out.println("Default Constructor");
    }
    */
    void defaultMethod(){
        System.out.println("Default Method");
    }

    public Class2(){
        super();
        this.DefaultAtribute = "Default Atribute access modification";
        System.out.println("Default Atribute = " + this.DefaultAtribute);
        this.defaultMethod();
    }


}
