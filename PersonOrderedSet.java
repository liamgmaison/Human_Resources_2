import java.util.Collections;

public class PersonOrderedSet extends PersonSet {
    @Override
    public void add(Person p) {
        if (!people.contains(p)) {
            people.add(p);
            Collections.sort(people, (p1, p2) -> p1.getName().compareTo(p2.getName()));
        }
    }
}