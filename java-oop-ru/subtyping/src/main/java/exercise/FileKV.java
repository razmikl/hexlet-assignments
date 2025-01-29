package exercise;

// BEGIN
import java.util.Map;

public class FileKV implements KeyValueStorage {

    private String path;
    private Map<String, String> storage;

    public FileKV(String path, Map<String, String> storage) {
        this.path = path;
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
