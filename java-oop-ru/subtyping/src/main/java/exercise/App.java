package exercise;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// BEGIN
public class App {
    public static void swapKeyValue (KeyValueStorage storage) {
        Object[] keysStorage = new Object[storage.toMap().size()];
        Object[] valuesStorage = new Object[storage.toMap().size()];

        Set keys = storage.toMap().keySet();
        int i = 0;
        for (var key : keys) {
            keysStorage[i] = key;
            i++;
        }

        var values = storage.toMap().values();
        i = 0;
        for (var value : values) {
            valuesStorage[i] = value;
            i++;
        }

        for (int j = 0; j < keysStorage.length; j++) {
            storage.unset(keysStorage[j].toString());
        }

        for (int j = 0; j < keysStorage.length; j++) {
            storage.set(valuesStorage[j].toString(), keysStorage[j].toString());
        }


    }
}
// END
