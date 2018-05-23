import java.io.Serializable;
import java.util.Comparator;

public class SSN implements Comparator<Person>, Serializable {

    @Override
    public int compare(Person p1, Person p2) {
        return Integer.parseInt(p1.getSSN()) - Integer.parseInt(p2.getSSN());
    }
}