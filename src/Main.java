import java.nio.file.FileSystemNotFoundException;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        //System.out.println(ex1());
        //System.out.println(ex2());
        //System.out.println(ex3());
        ex4();
    }

    public static String ex1(){
        var myCat = new Cat("Gypsy");
        return(myCat.toString());
    }

    public static String ex2(){
        var myTable = new Table(4);
        return ("The table has: " + myTable.countLegs());
    }

    public static String ex3(){
        Person p = new Person("Garrett", "Boscoe", (byte) 22, 11111111, 100000);
        return Employee.speak(p);
    }
    public static void ex4(){
            var shapes = new ArrayList<Shape>();
            var circle = new Circle();
            var square = new Square();
            var triangle = new Triangle();
            shapes.add(circle);
            shapes.add(square);
            shapes.add(triangle);

            for (Shape s: shapes) {
                System.out.println(s.draw()); // <= Polymorphism (late binding) is happening here.
            // }
        }
    }
}