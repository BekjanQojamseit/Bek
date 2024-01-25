import java.util.ArrayList;
import java.util.Collections;

public class Main
{
    public static void main(String[] args)
    {
        Employee e1 = new Employee("Jone", "Al-Farabi", "Software engineer", 8160000.00);
        Employee e2 = new Employee("Lebron", "Curry", "Back-end Developer", 2500000.00);
        Student s1 = new Student("Michael", "Balack", 4.00);
        Student s2 = new Student("Sebastian", "Fettel", 2.5);

        ArrayList<Person> people = new ArrayList<>();
        people.add(e1);
        people.add(e2);
        people.add(s1);
        people.add(s2);

        Collections.sort(people);

        printData(people);

    }

    public static void printData(Iterable<Person> people)
    {
        for (Person x : people)
        {
            System.out.println(x.toString() + " earns " + x.getPaymentAmount() + " tenge");
        }
    }
}