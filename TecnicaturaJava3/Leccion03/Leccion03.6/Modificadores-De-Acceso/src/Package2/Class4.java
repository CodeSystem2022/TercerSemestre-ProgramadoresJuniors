package Package2;

public class Class4 {
    private String pivateAtribute = "Private Atribute";
    private Class4(){
        System.out.println("Private constructor");
    }

    //creamos un constructor public para poder crear objetos
    public Class4(String argument){
        this();
        System.out.println("public constructor");
    }

    //Private Method
    private void PrivateMethod(){
        System.out.println("Private Method");
    }

    public String getPivateAtribute(){
    return pivateAtribute;
    }
    public void SetPrivateAtribute(String pivateAtribute){
        this.pivateAtribute = pivateAtribute;
    }

}
