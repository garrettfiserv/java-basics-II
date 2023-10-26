import java.nio.file.FileSystemNotFoundException;

public class Main{
    public static void main(String[] args) {
        //System.out.println(ex1());
        System.out.println(ex2());
        //System.out.println(ex3());

    }

    public static String ex1(){
        var myCat = new Cat("Gypsy");
        return(myCat.toString());
    }

    public static String ex2(){
        var myTable = new Table(4);
        return ("The table has: " + myTable.countLegs());
    }

    /*public static String ex3(){

    }*/
}