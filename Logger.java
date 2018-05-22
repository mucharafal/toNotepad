import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.List;

public class Logger {
    private String filename;

    public Logger(String filename){
        this.filename = filename;
    }

    public void log(List<Difference> differences) throws IOException
    {
        try(Writer writer = new FileWriter(filename, true))
        {
            for (Difference d: differences)
            {
                writer.append(d.toString());
                writer.append("\n");
            }

            writer.append("\n");
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}

