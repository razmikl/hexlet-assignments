package exercise;

import com.fasterxml.jackson.core.JsonProcessingException;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

// BEGIN
public class App {
    public static void save(Path filePath, Car car) throws IOException {
        String jsonString = car.serialize();
        Files.writeString(filePath, jsonString, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
    }

    public static Car extract(Path path) throws IOException {
        String jsonString = Files.readString(path);

        return Car.deserialize(jsonString);
    }
}
// END
