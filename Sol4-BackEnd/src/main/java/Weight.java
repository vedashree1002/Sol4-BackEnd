
import java.io.Serializable;
import java.util.Comparator;

public class Weight{
    public int compare(Person p1, Person p2) {
        return Double.compare(p1.getWeight(), p2.getWeight());
    }
}

