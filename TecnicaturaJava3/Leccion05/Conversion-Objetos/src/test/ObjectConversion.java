package test;
import domain.*;

public class ObjectConversion {
    public static void main(String[] args){
        Employee employee;
        employee = new Writer("Phillip", 5000, WriteType.CLASSIC);
        System.out.println(employee.GetDetails());

        ((Writer)employee).getWriteType();
    }

}
