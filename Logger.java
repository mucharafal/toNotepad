import java.io.IOException;
import java.io.Writer;
import java.util.List;

public class Logger {
    private Writer writer;

    public Logger(Writer writer){
        this.writer = writer;
    }

    public void log(List<Difference> differences) throws IOException
    {
        try
        {
            for (Difference d: differences)
            {
                writer.append(d.toString());
                writer.append("\n");
            }

        }

        catch (IOException e)
        {
            throw new IOException("Cannot log. Cause: " + e);
        }


    }
}

