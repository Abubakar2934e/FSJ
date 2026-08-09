
//in java muliple inheritence is not possible but can be achived  by using interface
//interface collects only function decleration and not the implementation of the function
// only abstract methods are allowed in interface
import java.util.Scanner;

interface Icricket {
    public void bat(String hand);

    public void bole(String hand);

    public void field();

}

class person {
    protected String name;
    protected int age;
    Scanner sc = new Scanner(System.in);

    public void accept() {
        System.out.println("Enter name and age");
        name = sc.next();
        age = sc.nextInt();
    }
}

class Cricketer extends person implements Icricket {
    protected String team;
    protected double salary;

    public void accept() {
        super.accept();
        System.out.println("Enter team and salary");
        team = sc.next();
        salary = sc.nextDouble();
    }

    public void bat(String hand) {
        System.out.println(name + " bats " + hand + "-handed for " + team);
    }

    public void bole(String hand) {
        System.out.println(name + " bowls " + hand + "-handed for " + team);
    }

    public void field() {
        System.out.println(name + " fields for " + team);
    }

    @Override
    public String toString() {
        return "Cricketer [name=" + name + ", age=" + age + ", team=" + team + ", salary=" + salary + "]";
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        Cricketer kohli = new Cricketer();
        kohli.accept();
        kohli.bat("Right");
        kohli.bole("Right");
        kohli.field();
        System.out.println(kohli.toString());
    }
}