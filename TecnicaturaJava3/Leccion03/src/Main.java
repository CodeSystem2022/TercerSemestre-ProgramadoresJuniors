
public class Main {
    public static void main(String[] args) {
        int ages[] = {5,6,7,8};
        for (int age: ages){
            System.out.println("age = " + age);
        }

        Person persons[] = {new Person("Juan"), new Person("Roberto"), new Person("Soel")};

        //Foreach
        for(Person person : persons ){
            System.out.println("person = " + person);
        }
    }

}