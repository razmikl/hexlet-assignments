package exercise;

import java.util.Map;
import java.util.HashMap;

// BEGIN
public class InMemoryKV implements KeyValueStorage {
    private Map<String, String> storage = new HashMap<>();

    public InMemoryKV(Map<String, String> storage) {
        this.storage = storage;
    }

    public String get(String key, String defaultValue) {
        if (this.storage.containsKey(key)) {
            return storage.get(key);
        } else {
            return defaultValue;
        }
    }

    public void set(String key, String newValue) {
        this.storage.put(key, newValue);
    }

    public void unset(String key) {
        if (this.storage.containsKey(key)) {
            this.storage.remove(key);
        }
    }

    public Map<String, String> toMap() {
        return this.storage;
    }
}
// END
