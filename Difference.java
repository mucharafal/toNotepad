public class Difference {
    private int line;
    private String oldText;
    private String newText;

    public Difference(int line, String oldText, String newText) {
        this.line = line;
        this.oldText = oldText;
        this.newText = newText;
    }

    @Override
    public String toString() {
        return "Change in line " + line
                + ", old: " + oldText
                + " new: " + newText;
    }
}
