import java.io.Serializable;
import java.util.Comparator;

public class DOB implements Comparator<Person>, Serializable{

    public int compare(Person p1, Person p2) {
        return p2.getDOB().compareTo(p1.getDOB());
    }
}
