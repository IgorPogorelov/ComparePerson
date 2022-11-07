import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Lena", "Petrova", 16));
        personList.add(new Person("Victor", "Petrov-Ivanov", 14));
        personList.add(new Person("Oleg", "Musin-Pushkin", 20));
        personList.add(new Person("Kirill", "Van Der Star", 14));
        personList.add(new Person("Fedor", "Sidorov", 17));
        personList.add(new Person("Lena", "Petrova-Sidorova Junior", 9));

        Comparator<Person> compare = (Person o1, Person o2) -> {
            String[] surnameThis = o1.getSurname().split("[ -]");
            String[] surnameO = o2.getSurname().split("[ -]");
            if (surnameThis.length <= 2 & surnameThis.length > surnameO.length) {
                return -1;
            } else if (surnameThis.length < surnameO.length & surnameO.length <= 2) {
                return 1;
            } else {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
        };
        Collections.sort(personList, compare);
        for (Person person : personList) {
            System.out.println(person);
        }
    }
}
