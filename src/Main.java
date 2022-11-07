import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Lena", "Petrova", 17));
        personList.add(new Person("Victor", "Petrov-Ivanov", 14));
        personList.add(new Person("Oleg", "Musin-Pushkin", 20));
        personList.add(new Person("Kirill", "Van Der Star", 14));
        personList.add(new Person("Fedor", "Sidorov", 17));
        personList.add(new Person("Lena", "Petrova-Sidorova Junior", 9));

        personList.removeIf(x -> x.getAge() < 18 );
        for (Person person : personList) {
            System.out.println(person);
        }
    }
}
