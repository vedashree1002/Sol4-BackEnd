import java.io.Serializable;
import java.util.Comparator;

public class FN implements Comparator<Person>, Serializable {

    public int compare(Person p1, Person p2) {
        return p2.getFN().compareTo(p1.getFN());
    }
}
