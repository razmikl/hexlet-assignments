package exercise;

import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class App {
    public static List<Home> buildApartmentsList(List<Home> apartments, int number) {
        apartments.sort((ap1, ap2) -> Integer.compare(ap1.getArea(), ap2.getArea()));
        List<String> result = new ArrayList<Strint>();

        for (int i = 0; i < number; i++) {
            result.add(apartments[i].toString());
        }
        return result;
    }
}
// END
