package domain;

public class Employee {
    protected String name;
    protected double salary;


    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }


    public String GetDetails(){
        return "Name: " + this.name + ", Salary: " + this.salary;
    }

    public String getName(){
        return name;
    }



}
