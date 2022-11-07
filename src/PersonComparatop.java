import java.util.Comparator;

public class PersonComparatop implements Comparator<Person> {
    private final int maxWordsInSurname;

    public PersonComparatop(int maxWordsInSurname) {
        this.maxWordsInSurname = maxWordsInSurname;
    }

    @Override
    public int compare(Person o1, Person o2) {
        String[] surnameThis = o1.getSurname().split("[ -]");
        String[] surnameO = o2.getSurname().split("[ -]");
        if (surnameThis.length <= maxWordsInSurname & surnameThis.length > surnameO.length) {
            return -1;
        } else if (surnameThis.length < surnameO.length & surnameO.length <= maxWordsInSurname) {
            return 1;
        } else {
            return Integer.compare(o1.getAge(), o2.getAge());
        }
    }
}