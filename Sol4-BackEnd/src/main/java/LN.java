import java.io.Serializable;
import java.util.Comparator;
public class LN implements Comparator<Person>, Serializable {

    @Override
    public int compare(Person p1, Person p2) {

        return p1.getLN().compareTo(p2.getLN());
    }
}
