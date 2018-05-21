import java.io.FileWriter;
import java.io.IOException;

public class Logger {
    private String filename;

    public Logger(String filename) {
        this.filename = filename;
    }

    public void log(Change change) throws IOException {
        try (FileWriter writer = new FileWriter(filename)){
            writer.append(change.toString());
        }

        catch (IOException e) {
            throw new IOException("Cannot log. Cause: " + e.getMessage());
        }

    }
}