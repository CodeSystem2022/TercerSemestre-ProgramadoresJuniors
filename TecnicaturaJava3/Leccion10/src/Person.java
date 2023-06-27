public class Person {
    private int Id;
    private String name;
    private String phone;
    private String email;
    private static int personNumbers = 0;


    // Empty constructor
    public Person(){
        this.Id = ++Person.personNumbers;
    }


    //Constructor with parameters(Constructor overload)
    public Person(String name, String phone, String email){
        this();
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static void main(String[] args){
        Person person1 = new Person("Soel","2604306032","soelattala7@gmail.com");
        System.out.println("Person1 = " + person1);
    }


}


