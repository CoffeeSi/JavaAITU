package Assignment_3_2.Task18;

import java.util.List;

public class RepkaStory {
    static void tell(List<Person> items) {
        Person first;
        Person second;

        for (int i = 1; i < items.size(); i++) {
            first = items.get(i - 1);
            second = items.get(i);
            first.pull(second);
        }
    }
}
