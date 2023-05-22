package domain;

import java.util.Objects;

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

    @Override
    public int hashCode(){
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.name);
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.salary) ^ Double.doubleToLongBits(this.salary));
        return hash;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj == null){
            return false;
        }
        if(getClass() != obj.getClass()){
            return false;
        }
        final Employee other = (Employee) obj;
        if(Double.doubleToLongBits(this.salary) != Double.doubleToLongBits(other.salary)){
            return false;
        }
        if(!Objects.equals(this.name,other.name)){
            return false;
        }
        return true;
    }



}
