public class Employee extends Person{
    public static String speak(Person person){
        return "Hello, my name is " + person.getFirstName() + " " + person.getLastName() + " and I make " + person.getSalary();
    }
}
