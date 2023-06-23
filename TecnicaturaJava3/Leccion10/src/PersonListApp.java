import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;


public class PersonListApp {
    public static void main(String[] args) {

        Scanner entry = new Scanner(System.in);
        List<Person> persons = new ArrayList<>();
        var exit = false;
        while(!exit){
            ShowMenu();
            try{
                exit = executeOperation(entry,persons);
            }catch(Exception e){
                System.out.println("An unexpected error occurred: " + e.getMessage());
            }
            System.out.println();
        }//End of while cycle

    } //End of main method

    private static void ShowMenu(){
        System.out.print("""
                **** PersonsList ****
                1. Add new Person
                2. List a new Person
                3. Exit 
                """);

        System.out.print("Please select one option: ");
    }//End of method show menu

    private static boolean executeOperation(Scanner entry, List<Person> persons){
        var option = Integer.parseInt(entry.nextLine());
        var exit = false;
        switch (option) {
            case 1 -> {//Add one person to the list
                System.out.println("Please write person's name");
                var name = entry.nextLine();
                System.out.println("Please wrtie person's phone");
                var phone = entry.nextLine();
                System.out.println("Please write the person's email");
                var email = entry.nextLine();
                var person = new Person(name, phone, email);
                persons.add(person);
                System.out.println("The list have: " + persons.size() + " elements.");
            }
            case 2 -> {//List persons
                System.out.println("Persons List");
                // persons.forEach((person)-> System.out.println(person));
                persons.forEach(System.out::println);
            }

            case 3 -> {
                System.out.println("See you later");
                exit = true;

            }
            default -> System.out.println("Incorrect option: " + option);
        }

        return exit;
    } //End of execute operation method


}//End of class person list app