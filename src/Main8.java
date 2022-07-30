import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        addPersons();
    }

    public static void addPersons() {
        List<Person> personList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press any key to start the programm, to exit write 'finish'");
        while (!scanner.nextLine().equals("finish")){
            personList.add(createPersons());
            System.out.println("Person added");
            System.out.println("Press 'Enter' to start programm, to exit write 'finish'");
        }
        System.out.println(personList);

    }

    public static Person createPersons(){

        Person person = new Person();
        MyDate date = new MyDate();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Set name of Person: ");
        person.setName(scanner.nextLine());

        System.out.println("Set day of Birth: ");
        int mydate = scanner.nextInt();
        while (mydate > 31 || mydate < 0) {
                System.out.println("Incorrect day");
                mydate = scanner.nextInt();
        }
        date.setDay(mydate);


        System.out.println("Set month of Birth: ");
        mydate = scanner.nextInt();
        while (mydate > 11 || mydate < 0) {
            System.out.println("Incorrect month");
            mydate = scanner.nextInt();
        }
        date.setMonth(mydate);

        System.out.println("Set year of Birth: ");
        mydate = scanner.nextInt();
        while (mydate > 2022 || mydate < 1900) {
            System.out.println("Incorrect year");
            mydate = scanner.nextInt();
        }
        date.setYear(mydate);

        person.setDate(date);
        return person;
    }
}
