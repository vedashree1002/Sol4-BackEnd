import java.io.Serializable;
import java.util.Comparator;

public class Height implements Comparator<Person>, Serializable {
    @Override
        public int compare(Person p1, Person p2) {
            return Double.compare(p1.getHeight(), p2.getHeight());
        }
    }

