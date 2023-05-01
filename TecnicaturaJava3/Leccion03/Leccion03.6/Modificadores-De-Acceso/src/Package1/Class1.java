package Package1;

public class Class1 {
public String publicAtribute = "Public atribute value";
protected String protectedAtribute = "Public Atribute Value";
    public Class1(){
        System.out.println("Public Constructor");
    }

    protected Class1(String publicAtribute){
        System.out.println("Protected Constructor");
    }

    public void PublicMethod(){
        System.out.println("Public Method Value");
    }

    protected void ProtectedMethod(){
        System.out.println("Protected method value");
    }
}
