package exercise;

import java.util.List;
import java.util.stream.Collectors;

// BEGIN
import java.util.ArrayList;
public class App {
    public static List<String> buildApartmentsList(List<Home> apartments, int number) {

        apartments.sort((ap1, ap2) -> Double.compare(ap1.getArea(), ap2.getArea()));
        List<String> result = new ArrayList<String>();

        if (number >= apartments.size()) {
            for (int i = 0; i < apartments.size(); i++) {
                result.add(apartments.get(i).toString());
            }
        } else {
            for (int i = 0; i < number; i++) {
                result.add(apartments.get(i).toString());
            }
        }
        return result;
    }
}
// END
