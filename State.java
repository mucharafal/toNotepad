import java.util.*;

public class State {
    private String text;
    private Date date;

    public State(String text) {
        this.text = text;
        date = new Date();
    }

    public List<Difference> getDifferences(State that)
    {
        Scanner thisScanner = new Scanner(text);
        Scanner thatScanner = new Scanner(that.text);
        int lineNumber = 0;
        List<Difference> result = new LinkedList<>();

        String thisLine;
        String thatLine;

        while (thisScanner.hasNextLine() && thatScanner.hasNextLine())
        {
            thisLine = thisScanner.nextLine();
            thatLine = thatScanner.nextLine();

            if (!thisLine.equals(thatLine))
            {
                result.add(new Difference(lineNumber, thisLine, thatLine));
            }

            lineNumber++;
        }

        while (thisScanner.hasNextLine())
        {
            thisLine = thisScanner.nextLine();
            result.add(new Difference(lineNumber, thisLine, ""));
            lineNumber++;
        }

        while (thatScanner.hasNextLine())
        {
            thatLine = thatScanner.nextLine();
            result.add(new Difference(lineNumber, "", thatLine));
            lineNumber++;
        }

        return result;
    }

    @Override
    public String toString() {
        return "Saved: " + date + "\n"
            + text;

    }

    @Override
    public boolean equals(Object that) {
        if (this == that) return true;
        if (that == null || ! (that instanceof State)) return false;
        State state = (State) that;
        return text.equals(state.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text);
    }

}
