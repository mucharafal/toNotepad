public class LineChange {
    private final int lineNumber;
    private final ChangeType changeType;
    private final String line_text;
    LineChange(int lineNumber, ChangeType type, String line){
        this.changeType = type;
        this.line_text = line;
        this.lineNumber = lineNumber;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public ChangeType getChangeType() {
        return changeType;
    }

    public String getLine_text() {
        return line_text;
    }

    @Override
    public String toString() {
        String res = "Change" + this.changeType.toString() +
                " in line " + this.lineNumber +
                "\nNew text of line: " + this.line_text;
        return res;
    }
}
