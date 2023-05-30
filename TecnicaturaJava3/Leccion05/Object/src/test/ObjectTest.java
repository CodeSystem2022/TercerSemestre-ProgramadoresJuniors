package test;
import domain.*;

public class ObjectTest {
    public static void main(String[] args){
        Employee employee1 = new Employee("Juan",10000);
        Employee employee2 = new Employee("juan", 10000);

        if(employee1 == employee2){
            System.out.println("They have the same memory reference");
        }else{
            System.out.println("They do not have the same memory reference");
        }


        if(employee1.equals(employee2)){
            System.out.println("Objects have the same content");
        }else{
            System.out.println("Object do not have the same content");
        }

        if(employee1.hashCode() == employee2.hashCode()){
            System.out.println("HashCode value is the same");
        }else{
            System.out.println("Hash code value is not the same");
        }
    }
}
